package baseclass;

public class EmployeeTest1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", 200000);
		System.out.println(e1.getName() + ", " +
							e1.getSalary());

	}

}
