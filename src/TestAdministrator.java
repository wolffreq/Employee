public class TestAdministrator {

	public static void main(String[] args) {

		Employee e = new Employee("Emp123", "Rachel", 30000, 2);
		Manager m = new Manager("Emp123", "Mr. Ray Brown", 65000, 3, "HR Manager", 40, "yes");
		e.errorDetection();
		m.errorDetection();
		e.display();
		m.display();
		m.updateSalary((float) 0.12);
		m.display();
		m.option();
		
	}
}
