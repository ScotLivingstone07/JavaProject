package part02;

import java.util.ArrayList;

public class Supplier {
   private int supCode;
   private String supName;
   private SupRegion supRegien;
   private Address supAddress;
   private ArrayList<Product> supProducts = new ArrayList<Product>();

   public Supplier(int supCode, String supName, SupRegion supRegien, Address supAddress, ArrayList<Product> supProducts) {
	super();
	this.supCode = supCode;
	this.supName = supName;
	this.supRegien = supRegien;
	this.supAddress = supAddress;
	this.supProducts = supProducts;
}
  public void printProductDetails() {
	  System.out.println("Product Details");
	  for(Product eachProduct : supProducts) {
		  System.out.println(eachProduct.getProductDetails());
		}
	}
  
 
  public int getSupCode() {
	return supCode;
}

  public void setSupCode(int supCode) {
	this.supCode = supCode;
}

  public String getSupName() {
	return supName;
}

  public void setSupName(String supName) {
	this.supName = supName;
}

  public SupRegion getSupRegien() {
	return supRegien;
}

  public void setSupRegien(SupRegion supRegien) {
	this.supRegien = supRegien;
}

  public Address getSupAddress() {
	return supAddress;
}

  public void setSupAddress(Address supAddress) {
	this.supAddress = supAddress;
}

  public ArrayList<Product> getSupProducts() {
	return supProducts;
}

  public void setSupProducts(ArrayList<Product> supProducts) {
	this.supProducts = supProducts;
}
   
   
   
   
   
}
   
 
   
