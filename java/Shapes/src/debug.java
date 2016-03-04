import java.util.Scanner;
public class debug extends Triangle{
		public static void main (String [] args) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please, enter a.");
			double a = keyboard.nextDouble();
			System.out.println("Please, enter b");
			double b = keyboard.nextDouble();
			System.out.println("Please, enter c");
			double c = keyboard.nextDouble();
			
			Triangle t;
			t = Triangle.createTriangle(a,b,c);
			System.out.println(t);
		
	}
}