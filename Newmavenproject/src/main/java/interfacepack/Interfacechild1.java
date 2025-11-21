package interfacepack;

public class Interfacechild1 implements Interfaceparent1, Interfaceparent2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Interfacechild1 obj=new Interfacechild1();
		obj.difference();
		obj.multiply();

	}

	@Override
	public void difference() {
		// TODO Auto-generated method stub
		System.out.println("Bull");
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		System.out.println("Arena");
		
	}

}
