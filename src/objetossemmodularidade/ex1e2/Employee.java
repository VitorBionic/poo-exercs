package objetossemmodularidade.ex1e2;

public class Employee {
	
	private String name;
	private double salary;
	private boolean minorApprentice;
	
	public Employee(String name, double salary, boolean minorApprentice) {
		this.name = name;
		this.salary = salary;
		this.minorApprentice = minorApprentice;
	}
	
	public void increaseSalary() {
		if (minorApprentice)
			salary = salary * 1.03;
		else
			salary = salary * 1.1;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Salary: R$ "
		+ String.format("%.2f", salary)
		+ ", Minor Apprentice: " + minorApprentice;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Rebeca", 2450, false);
		Employee emp2 = new Employee("Ronaldo", 1825, false);
		Employee emp3 = new Employee("João", 1200, true);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		emp1.increaseSalary();
		emp3.increaseSalary();
		System.out.println();
		System.out.println(emp1.salary);
		System.out.println(emp2.salary);
		System.out.println(emp3.salary);
	}
}
