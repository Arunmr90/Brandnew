package abstraction;

public class Abstractchild extends Abstractparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*Abstractchild obj=new Abstractchild();
 obj.sum();
 System.out.println(obj.difference());
 obj.display();
 
 obj.show();*/
 //its a abstract class reference creation
 Abstractparent obj1=new Abstractchild(5,6);
 System.out.println(obj1.difference());
 obj1.display();
 obj1.sum();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=6;
		int b=4;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public int difference() {
		// TODO Auto-generated method stub
		int d=8;
		int e=3;
		int i=d-e;
		
		return i;
	}public void show()
	{
		System.out.println("Devine");
	}
	public Abstractchild(int a, int b)
	{
		super(10,9);
		int c=a+b;
		System.out.println(c);
	}

}
