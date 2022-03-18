package runnable;

import baseclass.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		/*
		Employee e1 = new Employee("John", 200000);
	
		System.out.println(e1.getName() + ", " +
							e1.getSalary());
		e1.setSalary(0);
		System.out.println(e1.getName() + ", " +
				e1.getSalary());
	
		System.out.println(e1);
		
		Employee e2 = new Employee("Tom", 300000);
		System.out.println(e2);
		
		System.out.println(e1.isSalaryInRange(150000, 200000));
		System.out.println("Tax: " + e1.getTax());
		System.out.println(e1.hasGreaterSalary(e2));
		System.out.println(e2.hasGreaterSalary(e1));
		System.out.println(Employee.compareSalary(e1,e2));
		*/
		final int size = 5;
		Employee[] empArray = new Employee[size];
		for(int i = 0; i < empArray.length; i++) {
			int salary = (int)(Math.random()*200001) + 200000;
			int age = (int)(Math.random()*47) + 18;
			empArray[i] = new Employee("emp"+(i+1), age, salary);
			System.out.println(empArray[i]);
		}
		
		//Hány alkalmazott fizetése esik a tartományba
		System.out.println(countSalariesInRange(empArray, 300000, 400000));
		
	}
	
	public static int countSalariesInRange(Employee[] array, int min, int max) {
		int counter = 0;
		for (Employee item : array) {
			if (item.isSalaryInRange(min, max))
				counter++;
		}
		return counter;
	}

}
