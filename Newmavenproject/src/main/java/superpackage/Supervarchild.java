package superpackage;

public class Supervarchild extends Supervarparent {
	String color="Blue";
	public void display()
	{
		
		System.out.println(super.color); 
		System.out.println(color);
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervarchild obj=new Supervarchild();
		//System.out.println(obj.color);
		obj.display();

	}

}
