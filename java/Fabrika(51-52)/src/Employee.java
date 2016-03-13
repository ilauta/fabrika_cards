
//52. �� 10 ����������� "������� �� ��, ���" 5 � ���������� ��������
//�����. ��������� ����� Employee ��� �������, ������� ����� FabrikaManager
//��� �������� ���������� � �����������������������. �������� �����������
//��������� ������ ��� ���������� � ���������� ��������������� ������
//�������� � ������ ������. ����������� ������ a�d ��� ���� �����������
//��������, �.�. �������� � �����������, � ������� �����������. �����������
//����������� ���������� ������ ����������� �� ������ ���� �� ������
//
//Employee. ����������� ���������� � ���������� ������� ������������
//������.
//
//a.������ ������ � ����: INN ��� ��������
//
//b.��������� ����������� ���������� �����, ������� ������� ������
//�������� �� ����� ���������� ����� ��� ������ �����������.
//
//c.��������� ���������� � ����������� �������. ����������� � ����I:NN ��� ��������
//
//d.��������� ������ � ������������ �������. ����������� � ����:
//INN ��� �������



public class Employee implements IPayable, Comparable<Employee>{
	protected int inn;
	protected String name;
	protected String surname;
	protected double salary;
	
	public int getInn (){
		return inn;
	}
	public String getName (){
		return name;
	}
	public String getSurname (){
		return surname;
	}
	public double getSalary (){
		return salary;
	}
	
	public void setInn (int inn){
		this.inn = inn;
	}
	public void setName (String name){
		this.name = name;
	}
	public void setSurname (String surname){
		this.surname = surname;
	}
	public void setSalary (double salary){
		this.salary = salary;
	}
	
	public Employee() {}
	public Employee(int inn, String name, String surname, double salary) {}
	
	public static Employee createEmployee (int inn, String name, String surname, double salary){
		Employee e = new Employee();
		e.setInn(inn);
		e.setName(name);
		e.setSurname(surname);
		e.setSalary(salary);
		
		return e;
	}
	
	public double getAllSalary (Employee [] e){
		double allsalary = 0;
		for (int i=0; i<e.length; i++) {
			allsalary += e[i].salary;
		}
		return allsalary;
	}
	
	public static int getMinSalary (Employee [] e){
		int j = 0;
		for (int i=0; i<e.length; i++) {
			if (e[j].salary > e[i].salary) {
				j = i;
			}
		}
		return j;
	}
	
	public static int getMaxSalary (Employee [] e){
		int j = 0;
		for (int i=0; i<e.length; i++) {
			if (e[j].salary < e[i].salary) {
				j = i;
			}
		}
		return j;
	}
		
	public String toString() {
		return "INN="+this.inn + " FIO="+this.name +" "+this.surname + " SALARY = "+ this.salary;
	}
	
	public int compareTo(Employee o) { 
		return (this.name+this.surname).compareTo(o.name+o.surname) ; 
	}
}
