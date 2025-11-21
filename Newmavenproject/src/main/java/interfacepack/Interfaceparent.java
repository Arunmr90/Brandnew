package interfacepack;

public interface Interfaceparent {
	public static final int a=2;
	
	public abstract void sum();
	
  int v=6;

default void show()
{
	//a=3;final variables cannot be assigned
     
	System.out.println("World");
}
public static void display()
{
	System.out.println("good");
}
}