package abstraction;

public abstract class Abstractparent {
	public abstract void sum();
	public abstract int difference();
	public void display()
	{
		System.out.println("Aura");
		
	}
	public Abstractparent()
	{
		System.out.println("Peace");
	}
	public Abstractparent(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
}
