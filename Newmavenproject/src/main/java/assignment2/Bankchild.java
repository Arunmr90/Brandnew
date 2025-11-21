package assignment2;

public class Bankchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bankparent obj=new Bankparent();
       obj.setPin(1234);
       System.out.println(obj.getPin());
       obj.validate();
	}

}
