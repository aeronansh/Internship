package lab1;

public class Manager extends Employee {
	
	double allowance;

	public Manager(String name, int age, int eid, double basic_sal, double allowance) {
		super(name, age, eid, basic_sal);
		System.out.println("in manager constructor");
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		
		return ""+super.toString()+"Manager [allowance=" + allowance + "]";
	}





}
