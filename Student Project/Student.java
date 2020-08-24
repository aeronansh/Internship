package day5;

import static day5.Validation.sdf;

import java.util.Comparator;
import java.util.Date;;

public class Student implements Comparator<Student>{
	
	private int rollNum;
	private String firstName , lastName , className , section;
	private Date date;
	private String contactNum;
	//private MARKS M;
	private int phy , chem , math , en , comp;
	private Sports spt;
	
	
	public Student(int rollNum, String firstName, String lastName, String className, String section, Date date,
			String contactNum, int phy, int chem, int math, int en, int comp) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.className = className;
		this.section = section;
		this.date = date;
		this.contactNum = contactNum;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
		this.en = en;
		this.comp = comp;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getComp() {
		return comp;
	}
	public void setComp(int comp) {
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", firstName=" + firstName + ", lastName=" + lastName + ", className="
				+ className + ", section=" + section + ", date=" + sdf.format( date ) + ", contactNum=" + contactNum + ", phy=" + phy
				+ ", chem=" + chem + ", math=" + math + ", en=" + en + ", comp=" + comp + "]";
	}

	@Override
	public int compare(Student s1, Student s2) {
	
			if ( s1.getComp() == s2.getComp() )
			return 0;
			else if ( s1.getComp() < s2.getComp())
			return -1;
			else
			return 1;
			
		
	}


}
