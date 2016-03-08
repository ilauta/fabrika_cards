
public class Triangle extends Shapes {
	private double a;
	private double b;
	private double c;
	
	public double getA (){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC (){
		return c;
	}

	public void setA (double a){
		this.a = a;
	}
	public void setB (double b){
		this.b = b;
	}
	public void setC (double c){
		this.c = c;
	}
	
	private Triangle () {}
	private Triangle (double a, double b, double c) {}
	
	public static Triangle createTriangle (double a, double b, double c) {
		
		if ( a<(b+c)&& a>(b-c)&& b<(a+c)&& b>(a-c)&& c<(a+b)&& c>(a-b)&& a!=0 && b!=0 && c!=0 ) {
			Triangle t = new Triangle();
			t.setA(a);
			t.setB(b);
			t.setC(c);
					
			return t;
		} else {
			return null;
		}
	}
	
	public double getPerimeter() {
		double perimeter;
		perimeter = a + b + c;
		return perimeter;
	}
	
	public double getArea() {
		double area;
		area = Math.sqrt((a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
		return area;
	}
		
	public String toString() {
		return "Triangle:\n" + "a="+this.a + " b="+this.b +" c="+this.c + " Perimeter = "+ this.getPerimeter() + " Area = "+ this.getArea();
	}
	
	public static Triangle genShape() {
		double a = 1 + Math.random()*100;
		double b = 1 + Math.random()*100;
		double c = ( 1.1*Math.abs(a-b) + (Math.random()*((a+b)*0.9 - Math.abs(a-b)*1.1) -1));
		Triangle t = Triangle.createTriangle(a, b, c);
		return t;
	}
}

