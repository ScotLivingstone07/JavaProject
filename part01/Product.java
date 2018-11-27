package part01;

public class Product {
 
  private int proCode;
  private String proMake, proModel;
  private double proPrice;
  private int QtyAvailable;
  private boolean proDiscontined;

  public static void main(String[] args) {
	  
	}
  public Product(int proCode, String proMake, String proModel, double proPrice, int qtyAvailable,
	boolean proDiscontined) {

	this.proCode = proCode;
	this.proMake = proMake;
	this.proModel = proModel;
	this.proPrice = proPrice;
	this.QtyAvailable = qtyAvailable;
	this.proDiscontined = proDiscontined;
}
  public String getProductDetails() {
	  String product = getProCode() + ", " + getProModel() + ", " + getProPrice() + ", " + getQtyAvailable() + "," + getProDiscontined() ;
		return product;
		
	  
  
  
	}
public int getProCode() {
	return proCode;
}

public void setProCode(int proCode) {
	this.proCode = proCode;
}

public String getProMake() {
	return proMake;
}

public void setProMake(String proMake) {
	this.proMake = proMake;
}

public String getProModel() {
	return proModel;
}

public void setProModel(String proModel) {
	this.proModel = proModel;
}

public double getProPrice() {
	return proPrice;
}

public void setProPrice(double proPrice) {
	this.proPrice = proPrice;
}

public int getQtyAvailable() {
	return QtyAvailable;
}

public void setQtyAvailable(int qtyAvailable) {
	QtyAvailable = qtyAvailable;
}

public boolean getProDiscontined() {
	return proDiscontined;
}

public void setProDiscontined(boolean proDiscontined) {
	this.proDiscontined = proDiscontined;
}
  
  
}
