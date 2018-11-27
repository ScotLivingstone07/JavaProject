package part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {
	private static Scanner myScan = new Scanner(System.in);
	private static ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
	

	public static void main(String[] args) {
		Supplier s1 = Tester.supOne();
		Supplier s2 = Tester.supTwo();
		suppliers.add(s1);
		suppliers.add(s2);
		mainMenu();
	}

	public static void mainMenu() {
		System.out.println("---MAIN MENU---");
		System.out.println("1: Print Product Details");
		System.out.println("2: Add New Supplier");
		System.out.println("3: Add New Product");
		System.out.println("4: Add New Address");
		System.out.println("5: Print the Suppliers Products");
		System.out.println("6: Remove Supplier");
		System.out.println("7: Exit Application");
		System.out.print("Please Select Menu Option: ");

		while(!myScan.hasNextInt()) { 
			myScan.nextLine();
			System.out.println("Please enter a number.");
			System.out.print("Please Select Menu Option: ");
		}

		int menuChoice = myScan.nextInt(); myScan.nextLine(); 
		switch(menuChoice) {
		case 1: printAllProducts(); break;
		case 2: addNewSupplier(); break;
		case 3: addNewProduct(); break;
		case 4: addNewAddress(); break;
		case 5: printSuppliersProducts(); break;
		case 6: DeleteSupplier(); break;
		case 7:
			System.out.println("Closing"); 
			System.exit(0);
			break;
		default: 
			System.out.println();
			System.out.println("Please enter a vaild option");
			mainMenu();		
		}

	}
	
	public static void printAllProducts() {
		System.out.println();
		System.out.println("Products"); 
		for (Supplier eachpro : suppliers) {
			eachpro.printProductDetails();
			System.out.println();
		}
		System.out.print("Enter a number to return ");
		if (myScan.hasNextLine()) {
			myScan.nextLine();
			mainMenu();
		}
	}
	
	public static void addNewSupplier() { 
		System.out.println();
		System.out.println("Please enter Supplier Code:");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		
		int SupCode = myScan.nextInt();
		
		System.out.println("Please enter Supplier Name:");
		
		String SupName = myScan.next();
		myScan.nextLine();
		while(!SupName.matches("[a-zA-Z ]+")){
		    System.out.println("Entry invalid");
		     mainMenu();  
		}
		
		System.out.println("Please Enter the number of the region: "
				+ "1:United Kingdom" + " "
				+ "2:Europe" + " "
				+" 3:Outside EU");
		SupRegion supRegion = null;
		int region = myScan.nextInt(); myScan.nextLine();
		
	    
		switch(region) {
		case 0: supRegion = SupRegion.UNITED_KINGDOM; break;
		case 1: supRegion = SupRegion.EUROPE; break;
		case 2: supRegion = SupRegion.OUTSIDE_EU; break;
		default: 
			System.out.println("Invalid Region");
			mainMenu();
			
			
		}
		
		
		ArrayList<Product> newProduct = new ArrayList<Product>();
		
		Supplier s = new Supplier(SupCode, SupName, supRegion, null, newProduct);
		suppliers.add(s);
		
		mainMenu();
		
	}
	
	public static void addNewProduct() {
		System.out.println();
		System.out.println("Please enter Product Code");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		int proCode = myScan.nextInt();
		
		System.out.println("Please enter Product Make:");
		String proMake = myScan.next();
		myScan.nextLine();
		while(!proMake.matches("[a-zA-Z]+")){
		    System.out.println("Entry invalid");
		     mainMenu();
		}    
		System.out.println("Please enter Product Model:");
		String proModel = myScan.next();
		myScan.nextLine();
		while(!proModel.matches("[a-zA-Z]+")){
		    System.out.println("Entry invalid");
		     mainMenu();
		}
		System.out.println("Please enter Product Price:");
		
		
		while(!myScan.hasNextDouble()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		Double proPrice = myScan.nextDouble();
		System.out.println("Please enter how many of the Product are left:");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		int QtyAvailable = myScan.nextInt();
		
		System.out.println("Please enter if the Product is Discontinued:");
		while(!myScan.hasNextBoolean()) {
			System.out.println("Entry invalid");
		   mainMenu();
		}
		Boolean proDiscontined = myScan.nextBoolean();
		
		
		
		Product p = new Product(proCode, proMake, proModel, proPrice, QtyAvailable, proDiscontined);
		
		System.out.println("Which Supplier owns the Product: ");
		for (int i = 0; i<suppliers.size(); i++) {
			System.out.println((i+1) + ": ");
			
		}
		System.out.print("Please enter Suppliers Code: ");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		int supCode = myScan.nextInt()-1; myScan.nextLine();	
		Supplier mys = suppliers.get(supCode);
		mys.getSupProducts().add(p);
		mainMenu();
	}
	
	public static void addNewAddress() {
		System.out.println();
		System.out.println("Please enter Bulding Number: ");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		int bldNum = myScan.nextInt();
		
		System.out.println("Please enter the Street name: ");
		String bldStreet = myScan.next();
		myScan.nextLine();
		while(!bldStreet.matches("[a-zA-Z ]+")){
		    System.out.println("Entry invalid");
		     mainMenu();
		} 
		
		System.out.println("Please enter the Town name: ");
		String bldTown = myScan.next();
		myScan.nextLine();
		while(!bldTown.matches("[a-zA-Z ]+")){
		    System.out.println("Entry invalid");
		     mainMenu();
		} 
		
		System.out.println("Please enter the PostCode: ");
		String bldPcode = myScan.next();
		myScan.nextLine(); 
		
		System.out.println("Please enter the Country: ");
		String bldCountry = myScan.next();
		myScan.nextLine();
		while(!bldCountry.matches("[a-zA-Z ]+")){
		    System.out.println("Entry invalid");
		     mainMenu();
		} 
		
		Address a = new Address (bldNum, bldStreet, bldTown, bldPcode, bldCountry);
		
		System.out.println("Which Supplier works here: ");
		for (int i = 0; i<suppliers.size(); i++) {
			System.out.println((i+1) + ": ");
			
		}
		System.out.println("Enter Supplier Number: ");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		int supCode = myScan.nextInt(); myScan.nextLine();

		if (supCode > suppliers.size()) {
			   System.out.println("Supplier is not valid");
				mainMenu();;}
		
		else { 
			
			Supplier mys = suppliers.get(supCode-1);
			mainMenu();
		}
		
		
		mainMenu();
	}
	public static void printSuppliersProducts() {
		System.out.println();
		
		System.out.println("Please enter Supplier Name: ");
		
		String supName = myScan.nextLine();
        
		
		for (Supplier showSupplier: suppliers)
		{
		   if (showSupplier.getSupName().equals(supName)) {
		         showSupplier.printProductDetails();}
		
		else { 
			
		mainMenu();
		}
		}
		System.out.print("Enter a number to return ");
		if (myScan.hasNextLine()) {
			myScan.nextLine();
			mainMenu();
		}
		
	}
	public static void DeleteSupplier(){
		System.out.println();
		System.out.println("Products"); 
		for (Supplier eachpro : suppliers) {
			eachpro.printProductDetails();
			System.out.println();
		}
		System.out.println("Please select the number of the supplier that you want to remove starting at 0");
		while(!myScan.hasNextInt()) {
			System.out.println("Entry invalid");
		    mainMenu();
		}
		int supNum = myScan.nextInt();
		
		
		   if (supNum > suppliers.size()) {
			   System.out.println("Supplier is not valid");
				mainMenu();;}
		
		else { 
		suppliers.remove(supNum);
		}
		
		System.out.print("Enter a number to return ");
		
		if (myScan.hasNextLine()) {
			myScan.nextLine();
			mainMenu();
		}
	}
		
	
}
