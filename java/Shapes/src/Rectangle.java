
public class Rectangle extends Shapes {
	
	private double a;
	private double b;
	
	public double getA (){
		return a;
	}
	public double getB(){
		return b;
	}
	
	public void setA (double a){
		this.a = a;
	}
	public void setB (double b){
		this.b = b;
	}
	
	private Rectangle () {}
	private Rectangle (double a, double b) {}
	
	public static Rectangle createRectangle (double a, double b) {
		
		if ( a!=0&&b!=0 ) {
			Rectangle r = new Rectangle();
			r.setA(a);
			r.setB(b);
								
			return r;
		} else {
			return null;
		}
	}
	
	public double getPerimeter() {
		double perimeter;
		perimeter = 2*(a + b);
		return perimeter;
	}
	
	public double getArea() {
		double area;
		area = a*b;
		return area;
	}
		
	public String toString() {
		return "Rectangle:\n" + "a="+this.a + " b="+this.b + " Perimeter = "+ this.getPerimeter() + " Area = "+ this.getArea();
	}
	
	public static Rectangle genShape() {
		float a = 1 + (float)Math.random()*100;
		float b = 1 + (float)Math.random()*100;
		Rectangle r = createRectangle (a, b);
		return r;
	}
	

}
