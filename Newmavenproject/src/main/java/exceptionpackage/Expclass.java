package exceptionpackage;

public class Expclass {

	public static void main(String[] args) {
try
{// TODO Auto-generated method stub
int a=5;
int b=0;
int c=a/b;
System.out.println(c);
}
catch (ArithmeticException a)
{
	System.out.println("Excpetion.handled");
}
finally
{
	System.out.println("important code");
}
System.out.println("outside the code");

		/*int a[]= {4,5,7};
		for (int i=0; i<=3; i++)
		{
			System.out.println(a[i]);*/
		/*String a=null;
		System.out.println(a.length()
				);*/
		}
	}


