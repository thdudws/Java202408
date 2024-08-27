package emp;

public abstract class Employee {

	private String name;
	private int number;
	private String departmant;
	private int salary;
	
	public Employee() {}
	
	public Employee(String name, int number, String departmant, int salary) {
		this.name = name;
		this.number = number;
		this.departmant = departmant;
		this.salary = salary;
	}
	
	public abstract double tax ();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartmant() {
		return departmant;
	}

	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	double getExtraPay () {
		return 0;
		
	}
	
}
