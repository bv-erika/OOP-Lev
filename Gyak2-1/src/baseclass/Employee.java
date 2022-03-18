package baseclass;

public class Employee {

	private String name;
	private int age;
	private int salary;
	private static final int retiringAge = 65;
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age) {
		this(name, age, 250000);
	}

	public boolean isSalaryInRange(int min, int max) {
		if (this.salary >= min && this.salary <= max)
			return true;
		return false;
	}
	
	public double getTax() {
		return salary * 0.16;
	}
	
	public boolean hasGreaterSalary(Employee e) {
		if (this.salary > e.salary)
			return true;
		return false;
	}
	
	public static int compareSalary(Employee e1, Employee e2) {
		if (e1.salary > e2.salary)
			return 1;
		else if (e2.salary > e1.salary)
			return 2;
		else
			return 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		//minimálbér ellenőrzés
		if (salary < 250000)
			this.salary = 250000;
		else
			this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getRetiringAge() {
		return retiringAge;
	}

	//final adattagnak nem lehet setter metódusa
	/*
	public static void setRetiringAge(int retiringAge) {
		Employee.retiringAge = retiringAge;
	}*/
	
	public int getYearsUntilRetiring() {
		return retiringAge - age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", getYearsUntilRetiring()="
				+ getYearsUntilRetiring() + "]";
	}

	
	
	
}
