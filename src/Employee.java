import java.util.Scanner;

public class Employee {
	String id;
	String name;
	float annualSalary;
	int grade;
	Scanner in = new Scanner(System.in);

	public Employee(String id, String name, float annualSalary, int grade) {
		this.id = id;
		this.name = name;
		this.annualSalary = annualSalary;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(float annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	protected void errorDetection() {

		if((id.length() <= 6) && ("E".equals(id.substring(0)))) {
			System.out.println("Invalid entery! \nThe id should start with a captial E"
					+ " and be no longer than 6 characters long");
			id = null;
		}
		if ((annualSalary < 20000) || (annualSalary > 60000)) {
			annualSalary = 0;
			System.out.println("Invalid entery! \n"
					+ "The annual Salary must be no less then 20,000 and no greater then 60,000");
			
		}
		if ((grade < 1) || (grade > 5)) {
			grade = 0;
			System.out.println("Invalid entery! \nThe grade must be between 1 and 5 ");
		}
	}

	protected void updateSalary(float percent) {
		annualSalary += annualSalary * percent;
		grade++;
	}

	protected void display() {
		System.out.println("id:\t " + getId());
		System.out.println("name:\t " + getName());
		System.out.println("annualSalary:\t " + getAnnualSalary());
		System.out.println("grade:\t " + getGrade());	
	}
}
