
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
		
		if ( a<(b+c)&& a>(b-c)&& b<(a+c)&& b>(a-c)&& c<(a+b)&& c>(a-b) ) {
			Triangle t = new Triangle();
			t.setA(a);
			t.setB(b);
			t.setC(c);
			
			t.perimeter = a + b + c;
			t.area = Math.sqrt((a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));

			return t;
		} else {
			return null;
		}
	}
	
	public double getPerimeter() {
		return this.perimeter;
	}
	
	public double getArea() {
		return this.area;
	}
		
	public String toString() {
		return "Triangle:\n" + "a="+this.a + "b="+this.b +"c="+this.c + "Perimeter = "+ this.perimeter + "Area = "+this.area;
	}
}

