package superpackage;

public class Superchild extends Superparent{ 
	public Superchild()
	{
		//super(7,8);
		this(7);
		System.out.println("this is a child constructor");
	}
	public Superchild(int e)
	{
	    super();
		System.out.println(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Superchild obj=new Superchild();
     Superparent obj1=new Superparent(4,5);
     //Superchild obj1=new Superchild(3);
     
     
	}

}
