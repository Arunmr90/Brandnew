package assignment1;

public class Salaryslip extends Salary {
public void salaryslip()
{
	System.out.println("basicpay=" +basicpay +"\n"+ "deduction=" +deduction +"hra=" +hra + "pf"+pf + "totalslary=" +totalsalary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salaryslip obj=new Salaryslip();
		obj.getinput();
		obj.calculate();
		obj.totalsalary();
		obj.salaryslip();
		
		

	}

}
