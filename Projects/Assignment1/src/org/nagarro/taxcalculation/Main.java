package org.nagarro.taxcalculation;

import java.util.Scanner;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		String itemName, itemType;
		double itemPrice ,itemQuantity;
		ArrayList <Item> item = new ArrayList<Item>();
		
		
		Scanner sc = new Scanner(System.in);
		
		char input;
		
		do {
			
			System.out.println("Enter Item Name");
			itemName = sc.nextLine();

			System.out.println("Enter Item Type i.e. Raw,Manufactured,import");
			itemType = sc.nextLine();
			
			System.out.println("Enter item price");
			itemPrice = sc.nextDouble();
			
			System.out.println("Enter Item Quantity");
			itemQuantity = sc.nextDouble();
			
			// try catch block is used from restricting user to enter negative price or quantity value
			try {
				
				if(itemPrice < 0 || itemQuantity < 0) {
					throw new IllegalArgumentException("Item Qunatity Or Price can't be negative numbers ");
				}
					
			// object creating of Item Class
			Item item1 = new Item(itemName ,itemPrice, itemType, itemQuantity);
			
			
			// Method call for calculating tax caluclation for different items 
			 item1.taxRate();
		
			if(item1.salesTax!=0) {
				
				item.add(item1);
			
			}
			
		
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
				
			// taking an input for more items
			System.out.println("Do you want to add more items,Press 'Y' or 'y' otherwise press any other key");
			input = sc.next().charAt(0);
			sc.nextLine();
		
			
		}while(input =='y' || input == 'Y' );
		
		
		// Item Price , Itemname , sales tax and final cost of different items. output section
			for(Item t : item) {
				System.out.println("ItemName = " + t.itemName + " , " + "ItemPrice = " + t.itemPrice + " , " +  "sales tax per item = " + t.salesTax + " , " + "finalCost = " +  t.finalCost);
			
		}
	}
}

