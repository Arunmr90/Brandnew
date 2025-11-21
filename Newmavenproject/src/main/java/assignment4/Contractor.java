package assignment4;

public class Contractor extends Employee {

	private int workinghours;

	public Contractor(String name, int paymentperhour,int workinghours) {
		super(name, paymentperhour);
		this.workinghours=workinghours;
		// TODO Auto-generated constructor stub
	}
	/*public double Calculatesalary()
	{
		return paymentperhour* workinghours;
		
	}*/

	@Override
	public double Calculatesalary() {
		// TODO Auto-generated method stub
		return paymentperhour* workinghours;
	}

}
