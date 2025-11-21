package interfacepack;

public class Interfacechild implements Interfaceparent
{

	public static void main(String[] args) {
		Interfacechild obj=new Interfacechild();
		// TODO Auto-generated method stub
     obj.sum();
       Interfaceparent obj1=new Interfacechild();
       obj1.sum();
       obj1.show();
       Interfaceparent.display();
       System.out.println(obj.a);
        
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("Arun");
		
	}

}
