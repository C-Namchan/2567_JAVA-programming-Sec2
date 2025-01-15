
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String productName, double productPrice ,double productVatRate) {
		name = productName;
		price = productPrice;
		vatRate = productVatRate;
	}
	public double calculateTotalPrice() {
		double vatPrice = (price * vatRate/100);
		
		return vatPrice += price;
	}
	 public void displayProductDetails() {
		 System.out.println("Product Details: ");
		 System.out.println("Product Name: "+name);
		 System.out.println("Price (Before Vat): "+price);
		 System.out.println("Price (After Vat): "+calculateTotalPrice());

		 
	 }
}
