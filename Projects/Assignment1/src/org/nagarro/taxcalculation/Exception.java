package org.nagarro.taxcalculation;

public class Exception extends Item{
	
	public StringBuffer Exceptionhandling() {
		
			StringBuffer s = new StringBuffer();
		
			if(itemQuantity < 0 || itemPrice < 0) {
				System.out.println("Quantity and Price can't be negative numbers");
				
			}
			
			if(itemType.equalsIgnoreCase("raw") || itemType.equalsIgnoreCase("manufactured") || itemType.equalsIgnoreCase("import")) {
				
				System.out.println("ItemType is invalid");
				s.append("invalid");
			}
			
			return s;
		}
	
}
