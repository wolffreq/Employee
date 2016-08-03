import java.util.Scanner;

class Manager extends Employee {

	private String managerTitle;
	private int noOfStaff;
	private String bonusScheme;
	private float rate;

	public Manager(String id, String name, float annualSalary, int grade, String managerTitle, int noOfStaff,
			String bonusScheme) {
		super(id, name, annualSalary, grade);
		this.managerTitle = managerTitle;
		this.noOfStaff = noOfStaff;
		this.bonusScheme = bonusScheme;
	}

	public String getManagerTitle() {
		return managerTitle;
	}

	public void setManagerTitle(String managerTitle) {
		this.managerTitle = managerTitle;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public String getBonusScheme() {
		return bonusScheme;
	}

	public void setBonusScheme(String bonusScheme) {
		this.bonusScheme = bonusScheme;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	protected void errorDetection() {
		
		if (bonusScheme.matches("yes")) {
			rate = 5;
		} else {
			rate = 0;
		}
	}
	
	protected void display() {
		System.out.print("\n");
		super.display();
		System.out.println("manager’s title:\t " + getManagerTitle());	
		System.out.println("number of staff under his responsibility:\t " + getNoOfStaff());
		System.out.println("on bonus scheme:\t " + getBonusScheme());
		
	}
	protected void option(){
		System.out.print("\n");
		System.out.println("Query Option:\n1. Name\n2. Salary\n3. Grade\n4. Title\n"
				+ "5. Numberofstaff\n6. On Bonus Scheme\n7. Exit");
		Scanner input = new Scanner(System.in);
		int UsrIn = 0;
		
		while (UsrIn != 7) {
			UsrIn = input.nextInt();
			int option = UsrIn;
			switch (option) {
			case 1:
				System.out.println(getName());
				break;
			case 2:
				System.out.println(getAnnualSalary());
				break;
			case 3:
				System.out.println(getGrade());
				break;
			case 4:
				System.out.println(getManagerTitle());
				break;
			case 5:
				System.out.println(getNoOfStaff());
				break;
			case 6:
				System.out.println(getBonusScheme());
				break;
			default:
				System.out.println("Exit ");
				break;
			}
		}
		input.close();
	}
}
