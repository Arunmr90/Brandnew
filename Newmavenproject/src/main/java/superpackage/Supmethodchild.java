package superpackage;

public class Supmethodchild extends Supmethodparent {
public void view(){
	super.display();
    //super.sum(4, 7);
	System.out.println("women");	
	this.show();
}
public void show()
{
	super.sum(5, 9);
	System.out.println("dog");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supmethodchild obj=new Supmethodchild();
		//obj.display();
		obj.view();
        //obj.show();
	}

}
