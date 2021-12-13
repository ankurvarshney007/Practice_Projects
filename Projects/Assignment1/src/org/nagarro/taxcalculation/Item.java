package org.nagarro.taxcalculation;

public class Item {
	
	public String itemName;
	public String itemType;
	public double itemQuantity;
	public double itemPrice;
	public double taxRate; // tax rate charges on the basis on item type
	public double salesTax = 0.0;
	public double finalCost;
	
	Item( String itemName ,double itemPrice, String itemType, double itemQuantity){
		
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemQuantity=itemQuantity;
		this.itemType=itemType;
		
		
	}
	double rawTaxCalculate() {
		
		// sales tax per item on raw item tyes with the given price
		
		double tax = (itemPrice * taxRate * itemQuantity) / 100 ;
		return tax;
	}
	
	double manufacturedTaxCalculate() {
		 
		 // sales tax per item on manufactured item types with the given price
		 
		 double tax = (itemPrice * taxRate * itemQuantity) / 100 ;
		 
		 // 2% more salestax on itemcost + tax i.e. final cost of item
		 
		 tax = 2 * (tax + (itemPrice * itemQuantity)) / 100 + tax;
		 return tax;
		
	}
	
	double importTaxCalculate() {
		
		 // sales tax per item on import item types with the given price
		
		 double tax = (itemPrice * taxRate * itemQuantity) / 100;
		 double finalCost = tax + itemPrice * itemQuantity;
		
		 // conditions for calculating surplus charge on import item 
		
		if(finalCost < 100) {
			tax = tax + 5;
		}
		
		else if(finalCost > 100 && finalCost < 200) {
			tax = tax + 10;
		}
		
		else {
			tax = (5 * finalCost) / 100 + tax;
			
		}
		
		return tax;
	
	
	}
	
	public void taxRate() {
		
		//sales tax for different item types
		
		// Exception handling for handling invalid input i.e try catch block
		try {
			if(itemType.equalsIgnoreCase("raw")) {
			
			// tax rate for Raw item is 12.5% 
			
				this.taxRate = 12.5;
				this.salesTax = rawTaxCalculate();
				this.finalCost = salesTax + itemPrice * itemQuantity ;
			
			}
		
			else if(itemType.equalsIgnoreCase("manufactured")) {
			
				// tax rate for manufactured item is 12.5%
			
				this.taxRate = 12.5;
				salesTax = manufacturedTaxCalculate();
				finalCost = salesTax + itemPrice * itemQuantity;
			
			}
		
			else if(itemType.equalsIgnoreCase("import")) {
			
				// for import item types there is 10% import charge 
			
				this.taxRate = 10;
				salesTax = importTaxCalculate();
				finalCost = salesTax + itemPrice * itemQuantity;
			
			}
		
			else 
				
				throw new RuntimeException();
			
		}catch(RuntimeException e) {
			
			System.out.println(e + " Enter Item Type is Invalid .");
		}
		
		
		 
		}
		
}
