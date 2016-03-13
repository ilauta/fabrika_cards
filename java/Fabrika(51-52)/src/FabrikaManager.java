
public class FabrikaManager extends Employee {
	private double bonus;
	
	public double getBonus (){
		return bonus;
	}
	
	public void setBonus (double bonus){
		this.bonus = bonus;
	}
	public FabrikaManager() {};
	public FabrikaManager(int inn, String name, String surname, double salary, double bonus) {} 
	
	public static FabrikaManager createFabrikaManager (int inn, String name, String surname, double salary, double bonus){
		FabrikaManager e = new FabrikaManager();
		e.setInn(inn);
		e.setName(name);
		e.setSurname(surname);
		e.setSalary(salary);
		e.setBonus(bonus);
		
		return e;
	}

	public double getSalary() {
	return super.getSalary() + bonus;
	}
	
	public String toString() {
	return "INN="+this.inn + " FIO*="+this.name +" "+this.surname + " SALARY = "+ this.getSalary();
	}
}
