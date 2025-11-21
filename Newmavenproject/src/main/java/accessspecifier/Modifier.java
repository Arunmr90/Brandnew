package accessspecifier;

public class Modifier {
public void pubmethod()
{
	System.out.println("This is a public method");
}
private void primethod()
{
	System.out.println("This is a private methoid");
}
protected void promethod()
{
	System.out.println("This is a protected method");
}
void defmethod()
{
	
System.out.println("This is a Default method");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Modifier obj=new Modifier();
 obj.defmethod();
 obj.primethod();
 obj.promethod();
 obj.pubmethod();
	}

}
