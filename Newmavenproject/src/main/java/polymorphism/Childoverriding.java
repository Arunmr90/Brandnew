package polymorphism;

public class Childoverriding extends Parentoverriding{
	public void sum(int a, int b)
	{
		super.sum(3, 5);
		int c=a-b;
		System.out.println(c);
	}
	public int display(int d, int e)
	{
		System.out.println(super.display(3, 5));
		int i=d+e;
		return(i);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childoverriding obj=new Childoverriding();
        obj.sum(3,5);
        System.out.println(obj.display(3, 5));
	}

}
