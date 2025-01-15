import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Enter product name: ");
		String productName = scan.nextLine();
		System.out.print("Enter product price: ");
		double productPrice = scan.nextDouble();
		System.out.print("Enter Vat rate(%): ");
		double productVatRate = scan.nextDouble();
		
		product.setProductDetails(productName, productPrice, productVatRate);
		product.displayProductDetails();
	}

}
