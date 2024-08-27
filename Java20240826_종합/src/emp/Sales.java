package emp;

public class Sales extends Employee implements Bonus {

	public Sales() {
	}
	
	public Sales(String name, int number, String departmant, int salary) {
		super(name, number, departmant, salary);
	}

	@Override
	public double tax() {
		return getSalary()*0.13;
	}

	@Override
	public void incentive(int pay) {
		int tmp = getSalary()+(int)(pay*1.2);
		setSalary(tmp);
	}
	
	public double getExtraPay() {
		return getSalary()*0.03;
	}

}
