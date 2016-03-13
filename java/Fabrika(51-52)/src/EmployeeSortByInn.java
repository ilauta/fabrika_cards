import java.util.Comparator;
public class EmployeeSortByInn implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) { 
		return o1.getInn()-o2.getInn(); 
	}
}
