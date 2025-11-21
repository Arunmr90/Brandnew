package assignment1;

import java.util.Scanner;

public class Parentclass {
	double basicpay;
	double deduction;
	double bonus;
	public void getinput()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the basic pay");
		basicpay=obj.nextDouble();
		System.out.println("enter the"
				+ " deduction");
		deduction=obj.nextDouble();
		System.out.println("enter the bonus");
				bonus=obj.nextDouble();
	}

}
