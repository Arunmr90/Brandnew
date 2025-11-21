package assignment4;

public class Fulltimeemployee extends Employee {
	

	public Fulltimeemployee(String name, int paymentperhour) {
		super(name, paymentperhour);
		// TODO Auto-generated constructor stub
	}
	public double Calculatesalary()
	{
		return paymentperhour*8;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contractor obj=new Contractor("Arun", 50, 10);
Fulltimeemployee obj1=new Fulltimeemployee("Sachin", 100);
System.out.println(obj.Calculatesalary());
System.out.println(obj1.Calculatesalary());

	}

}
