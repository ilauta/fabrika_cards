
public class Ellipse extends Shapes {
	private double rOne;
	private double rTwo;
	
	public double getROne(){
		return rOne;
	}
	public double getRTwo(){
		return rTwo;
	}
	
	public void setROne (double rOne){
		this.rOne = rOne;
	}
	public void setRTwo (double rTwo){
		this.rTwo = rTwo;
	}
	
	private Ellipse () {}
	private Ellipse (double rOne, double rTwo) {}
	
	public static Ellipse createEllipse (double rOne, double rTwo) {
		
		if (rOne!=0&&rTwo!=0) {
			Ellipse e = new Ellipse();
			e.setROne(rOne);
			e.setRTwo(rTwo);
								
			return e;
		} else {
			return null;
		}
	}
	
	public double getPerimeter() {
		double perimeter;
		perimeter = 4*( ((Math.PI*rOne*rTwo)+ (rOne-rTwo)*(rOne-rTwo))/(rOne+rTwo) );
		return perimeter;
	}
	
	public double getArea() {
		double area;
		area = Math.PI*rOne*rTwo;
		return area;
	}
		
	public String toString() {
		return "Ellipse:\n" + "R1="+this.rOne + " R2="+this.rTwo + " Perimeter = "+ this.getPerimeter() + " Area = "+ this.getArea();
	}
	
	public static Ellipse genShape() {
		float rOne = 1 + (float)Math.random()*100;
		float rTwo = 1 + (float)Math.random()*100;
		Ellipse e = createEllipse(rOne, rTwo);
		return e;
	}
}
