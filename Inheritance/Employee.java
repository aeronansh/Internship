package lab1;

public class Employee extends Person {
	
	int eid;
	double basic_sal;
	
	
	
	public Employee(String name, int age, int eid, double basic_sal) {
		super(name, age);
		System.out.println("in employee constructor");
		this.eid = eid;
		this.basic_sal = basic_sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getBasic_sal() {
		return basic_sal;
	}

	public void setBasic_sal(double basic_sal) {
		this.basic_sal = basic_sal;
	}

	@Override
	public String toString() {
		return " "+super.toString()+"Employee [eid=" + eid + ", basic_sal=" + basic_sal + "]";
	}
	

}
