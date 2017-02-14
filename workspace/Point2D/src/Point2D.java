//Lab#7 | Final Lab 
//Marissa Guevara | CISC 3120

// Create a new class, Point2D
public class Point2D {
	// which has the following:
	// two integer data fields, x and y declared according to rules of encapsulation.
	private int x;
	private int y;
	
	//  2 constructors; one of them takes no parameters and sets the fields x and y both to 0, 
	// and the other takes two integer parameters and sets x and y values respectively.
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// accessor and mutator methods to change the values of its data fields.
	public void setx(int x) {
		this.x = x;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	
	public int getx() {
		return this.x;
	}
	
	public int gety() {
		return this.y;
	}
	
	// overriden toString() method to display any Point2D object in mathematical format, e.g. (2,7)
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	// a compareTo(Point2D) method
	public int compareTo(Point2D other) {
		if(this.x == other.x && this.y == other.y)
			return 0;
		
		return -1;
	}
	
	// main method to perform unit test for this class and its methods
	public static void main(String[] args) {
		// test constructor 1
		System.out.println(new Point2D());
		
		// test constructor 2
		System.out.println(new Point2D(1, 2));
		
		// test setter and getter
		Point2D p = new Point2D();
		p.setx(11);
		p.sety(12);
		
		System.out.println(p.getx());
		System.out.println(p.gety());
		
		// test compareTo
		Point2D p1 = new Point2D(2, 2);
		Point2D p2 = new Point2D(2, 2);
		
		System.out.println(p1.compareTo(p2));
		
		p1.setx(10);
		System.out.println(p1.compareTo(p2));
	}
}






		
	


