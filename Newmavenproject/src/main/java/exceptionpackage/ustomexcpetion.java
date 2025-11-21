package exceptionpackage;

public class ustomexcpetion {

	public static void main(String[] args) throws Votingexception {
		
		// TODO Auto-generated method stub
		int age=16;
		if (age>=18) { 
			System.out.println("Eligible");
		}
		else
		{
			throw new Votingexception("not eligible");
		}

	}

}
