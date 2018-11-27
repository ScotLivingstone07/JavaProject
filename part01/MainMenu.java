package part01;

import java.util.ArrayList;
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
		System.out.println("5: Exit Application");
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
		case 5: 
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
		int SupCode = myScan.nextInt();
		
		System.out.println("Please enter Supplier Name:");
		String SupName = myScan.next();
		myScan.nextLine();
		System.out.println("Please Enter the number of the region: "
				+ "0:United Kingdom" + " "
				+ "1:Europe" + " "
				+" 2:Outside EU");
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
		int proCode = myScan.nextInt();
		
		System.out.println("Please enter Product Make:");
		String proMake = myScan.next();
		myScan.nextLine();
		System.out.println("Please enter Product Model:");
		String proModel = myScan.next();
		myScan.nextLine();
		System.out.println("Please enter Product Price:");
		Double proPrice = myScan.nextDouble();
		
		System.out.println("Please enter how many of the Product are left:");
		int QtyAvailable = myScan.nextInt();
		
		System.out.println("Please enter if the Product is Discontinued:");
		Boolean proDiscontined = myScan.nextBoolean();
		
		
		
		Product p = new Product(proCode, proMake, proModel, proPrice, QtyAvailable, proDiscontined);
		
		System.out.println("Which Supplier owns the Product: ");
		for (int i = 0; i<suppliers.size(); i++) {
			System.out.println((i+1) + ": ");
			
		}
		System.out.print("Please enter Suppliers Code: ");
		int supCode = myScan.nextInt()-1; myScan.nextLine();	
		Supplier mys = suppliers.get(supCode);
		mys.getSupProducts().add(p);
		mainMenu();
	}
	
	public static void addNewAddress() {
		System.out.println();
		System.out.println("Please enter Bulding Number: ");
		int bldNum = myScan.nextInt();
		
		System.out.println("Please enter the Street name: ");
		String bldStreet = myScan.next();
		myScan.nextLine();
		System.out.println("Please enter the Town name: ");
		String bldTown = myScan.next();
		myScan.nextLine();
		System.out.println("Please enter the PostCode: ");
		String bldPcode = myScan.next();
		myScan.nextLine();
		System.out.println("Please enter the Country: ");
		String bldCountry = myScan.next();
		myScan.nextLine();
		
		Address a = new Address (bldNum, bldStreet, bldTown, bldPcode, bldCountry);
		
		System.out.println("Which Supplier works here: ");
		for (int i = 0; i<suppliers.size(); i++) {
			System.out.println((i+1) + ": ");
			
		}
		System.out.println("Enter Supplier Number: ");
		int supCode = myScan.nextInt(); myScan.nextLine();
		Supplier mys = suppliers.get(supCode-1);
		
		
		mainMenu();
	}
}
