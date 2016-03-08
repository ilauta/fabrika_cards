import java.util.Scanner;
import java.util.Random;
public class debug{
		public static void main (String [] args) {
			Scanner keyboard = new Scanner(System.in);
			Random rand = new Random();
//			System.out.println("Please, enter a.");
//			double a = keyboard.nextDouble();
//			System.out.println("Please, enter b");
//			double b = keyboard.nextDouble();
//			System.out.println("Please, enter c");
//			double c = keyboard.nextDouble();
//			
//			Triangle t;
//			t = Triangle.genShape();
//			System.out.println(t);
			
//			Ellipse e;
//			e = Ellipse.genShape();
//			System.out.println(e);
			
//			Rectangle r;
//			r = Rectangle.genShape();
//			System.out.println(r);
//			
			Shapes [] shapeArray = new Shapes [10];
			int i,n;
			
			for (i=0; i<shapeArray.length; i++) {
				n = rand.nextInt(3);
				if (n==1) {shapeArray[i] = Triangle.genShape();}
				else if (n==2) {shapeArray[i] = Ellipse.genShape();}
				else {shapeArray[i] = Rectangle.genShape();}
				System.out.println("index n= "+ n +" --> " + shapeArray[i]);
			}
			
			
			
//			System.out.println("Please, enter R1");
//			double rOne = keyboard.nextDouble();
//			System.out.println("Please, enter R2");
//			double rTwo = keyboard.nextDouble();
//			
//			
//			Ellipse e;
//			e = Ellipse.createEllipse(rOne, rTwo);
//			System.out.println(e);
			
			
//			System.out.println("Please, enter a");
//			double a = keyboard.nextDouble();
//			System.out.println("Please, enter b");
//			double b = keyboard.nextDouble();
//			
//			Rectangle e;
//			e = Rectangle.createRectangle(a, b);
//			System.out.println(e);
		
	}
}