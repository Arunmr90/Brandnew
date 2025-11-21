package exceptionpackage;

public class throwexample {
	public static void main(String argg[]) throws Exception {
		int age =16;
		if (age>=18)
		{
		System.out.println("Eligible for voting");
		}
		else
		{
			throw new Exception("not eligible for voting");
		}
		
			
	}

}
