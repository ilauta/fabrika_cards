//import java.util.Random;
import java.util.Arrays;
//import java.util.Scanner;
public class debugger {
//	
//	public static int[] getINN (){
//		Random rand = new Random();
//		int [] inn = new int [10];
//		for (int i = 0; i<inn.length; i++){
//			inn[i] = rand.nextInt(12);
//		}
//		return inn;
//	}
	
//	public static void printArray (int[] arr) {
//	    for (int i=0; i<arr.length; i++){
//	       System.out.print(arr[i]+" ");
//	    }
//	}
	
	 public static void main (String [] args){
//		 	Scanner keyboard = new Scanner(System.in);
//			//Random rand = new Random();
//			System.out.println("Please, enter INN.");
//			int inn = keyboard.nextInt();
//			System.out.println("Please, enter name");
//			String name = keyboard.next();
//			System.out.println("Please, enter surname");
//			String surname = keyboard.next();
//			System.out.println("Please, enter salary.");
//			double salary = keyboard.nextDouble();
			
		 Employee [] employeeArray = new Employee [10];
		 employeeArray [0] = Employee.createEmployee(1001,"Ievgen","Ivanov",50000);
		 employeeArray [1] = Employee.createEmployee(1002,"Oleg","Petrov",8001);
		 employeeArray [2] = Employee.createEmployee(1003,"Yuriy","Sidorov",10040);
		 employeeArray [3] = Employee.createEmployee(1004,"Boris","Kovalenko",30900);
		 employeeArray [4] = FabrikaManager.createFabrikaManager(1005,"Alexander","Petrenko",45667,1000);
		 employeeArray [5] = Employee.createEmployee(1006,"Sergey","Sidorenko",20031);
		 employeeArray [6] = Employee.createEmployee(1007,"Vladimir","Sirotenko",8000);
		 employeeArray [7] = Employee.createEmployee(1008,"Irina","Korableva",13800);
		 employeeArray [8] = Employee.createEmployee(1009,"Elena","Copipastova",25066);
		 employeeArray [9] = FabrikaManager.createFabrikaManager(1010,"Nataliya","Martinenko",20001,1000);
		 
		 for (int i=0; i<10; i++){
			 System.out.println(employeeArray[i]);
		 }
		 
		double allsalary = Employee.getAllSalary(employeeArray);
		System.out.println("All salary = " + allsalary);
		
		int minindex = Employee.getMinSalary(employeeArray);
		System.out.println("Min salary = " + employeeArray[minindex]);
		
		int maxindex = Employee.getMaxSalary(employeeArray);
		System.out.println("Max salary = " + employeeArray[maxindex]);
		 
		Arrays.sort(employeeArray);
		System.out.println("Sort by name");
		for (int i=0; i<10; i++){
			 System.out.println(employeeArray[i]);
		 }
		
		
		Arrays.sort(employeeArray, new EmployeeSortByInn());
		System.out.println("Sort by INN");
		for (int i=0; i<10; i++){
			 System.out.println(employeeArray[i]);
		 }
		
		Arrays.sort(employeeArray, new EmployeeSortBySalary());
		System.out.println("Sort by Salary");
		for (int i=0; i<10; i++){
			 System.out.println(employeeArray[i]);
		 }
//		 Employee e;
//			System.out.println(e);

	 }
}
