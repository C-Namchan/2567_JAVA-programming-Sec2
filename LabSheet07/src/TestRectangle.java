
public class TestRectangle {

	public static void main(String[] args) {
//test Constructor
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Displaye data usinf toString() method");
		System.out.println(r1);
		Spacing();
		Rectangle r2 = new Rectangle (1.2f, 3.4f);
		System.out.println(r2);
		
		//test setter and getter method
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		Spacing();
		System.out.println(r1);
		System.out.println("length is: "+ r1.getLength());
		System.out.println("width is: "+ r1.getWidth());
		Spacing();
		
		System.out.printf("area is %.2f%n", r1.getArea());
		System.out.printf("Perimeter is %.2f", r1.getPerimeter());
	}

	public static void Spacing() {
		System.out.println();
	}
}
