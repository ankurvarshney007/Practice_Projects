package org.nagarro.taxcalculation;

public class Item {
	
	private String itemName;
	private String itemType;
	private double itemQuantity;
	private double itemPrice;
	private double taxRate; // tax rate charges on the basis on item type
	private double salesTax = 0.0;
	private double finalCost;
	static final  String TYPE1 = "raw";
	static final  String TYPE2 = "manufactured";
	static final  String TYPE3 = "import";
	
	
	Item( String itemName ,double itemPrice, String itemType, double itemQuantity){
		
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemQuantity=itemQuantity;
		this.itemType=itemType;
		
		
	}
	public String getItemName() {
		return itemName;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public double getSalesTax() {
		return salesTax;
	}
	
	public double getFinalCost() {
		return finalCost;
	}
	
	double rawTaxCalculate() {
		
		// sales tax per item on raw item tyes with the given price
		
		double tax = (itemPrice * taxRate ) / 100 ;
		return tax;
	}
	
	double manufacturedTaxCalculate() {
		 
		 // sales tax per item on manufactured item types with the given price
		 
		 double tax = (itemPrice * taxRate ) / 100 ;
		 
		 // 2% more salestax on itemcost + tax i.e. final cost of item
		 
		 tax = 2 * (tax + itemPrice) / 100 + tax;
		 return tax;
		
	}
	
	double importTaxCalculate() {
		
		 // sales tax per item on import item types with the given price
		
		 double tax = (itemPrice * taxRate) / 100;
		 double finalCost = tax + itemPrice;
		 double surplus;
		
		 // conditions for calculating surplus charge on import item 
		
		if(finalCost < 100) {
			surplus = finalCost + 5 ;
			tax = surplus + tax ;
		}
		
		else if(finalCost > 100 && finalCost < 200) {
			surplus = finalCost + 10;
			tax = tax + surplus;
		}
		
		else {
			surplus = (5 * finalCost) / 100 + finalCost;
			tax = tax + surplus;
			
		}
		
		return tax;
	
	
	}
	
	public void taxRate() {
		
		//sales tax for different item types
		
		// Exception handling for handling invalid input i.e try catch block
		try {
			if(itemType.equalsIgnoreCase(TYPE1)) {
			
			// tax rate for Raw item is 12.5% 
			
				this.taxRate = 12.5;
				this.salesTax = rawTaxCalculate();
				this.finalCost = salesTax + itemPrice;
			
			}
		
			else if(itemType.equalsIgnoreCase(TYPE2)) {
			
				// tax rate for manufactured item is 12.5%
			
				this.taxRate = 12.5;
				salesTax = manufacturedTaxCalculate();
				finalCost = salesTax + itemPrice;
			
			}
		
			else if(itemType.equalsIgnoreCase(TYPE3)) {
			
				// for import item types there is 10% import charge 
			
				this.taxRate = 10;
				salesTax = importTaxCalculate();
				finalCost = (salesTax + itemPrice);
			
			}
		
			else 
				
				throw new RuntimeException();
			
		}catch(RuntimeException e) {
			
			System.out.println(e + " Enter Item Type is Invalid .");
		}
		
	}
		
}
