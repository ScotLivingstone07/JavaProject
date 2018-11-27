package part01;
import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
	

	public static Supplier supOne() {
		Address add1 = new Address(4, "Moria Road", "Ballinderry", "BT28 2HG", "Northern Ireland");
		Product pro1 = new Product(0230, "HP", "pavilion", 800.99, 5, false);
		
		Address add2 = new Address(17, "Lisburn Road", "Moria", "BT28 6ER", "Northern Ireland");
		Product pro2 = new Product(4573, "Dell", "inspiron", 534.99, 15, false);
		
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(pro1);
		product.add(pro2);
		
		Supplier s =  new Supplier(34, "Lisburn Computer Shop",SupRegion.UNITED_KINGDOM, add1, product);
		return s;
	}
	
	public static Supplier supTwo() {
		Address add1 = new Address(45, "Malone Road", "Belfast", "BT26 5AH", "Northern Ireland");
		Product pro1 = new Product(0230, "Acer", "ChromeBook", 189.99, 26, false);
		
		Address add2 = new Address(2, "Boucher Road", "Belfast", "BT27 8ZY", "Northern Ireland");
		Product pro2 = new Product(4573, "MIS", "2GD", 758.99, 3, true);
		
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(pro1);
		product.add(pro2);
		
		Supplier s =  new Supplier(23, "Belfast Computer Shop",SupRegion.UNITED_KINGDOM, add2, product);
		return s;
}
}

	
