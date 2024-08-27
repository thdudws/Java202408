package emp;

public class Secretary extends Employee implements Bonus {

	public Secretary() {}

	public Secretary(String name, int number, String departmant, int salary) {
		super(name, number, departmant, salary);
	}
	
	@Override
	public double tax() {
		return getSalary()*0.1;
	}

	@Override
	public void incentive(int pay) {
		int tmp = getSalary()+(int)(pay*0.8);
		setSalary(tmp);
	}

	
}
