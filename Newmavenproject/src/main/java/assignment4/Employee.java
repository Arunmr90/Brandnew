package assignment4;

abstract class Employee {
	String name;
	int paymentperhour;
	public abstract double Calculatesalary();
	
	
	public Employee(String name, int paymentperhour)
	{
		this.name=name;
		this.paymentperhour=paymentperhour;
	}

}
