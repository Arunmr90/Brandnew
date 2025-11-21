package polymorphism;

public class Childoverr extends Parentoverr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childoverr obj=new Childoverr();
		obj.sum(3, 5);

	}

	@Override
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		super.sum(4, 8);
	}

}
