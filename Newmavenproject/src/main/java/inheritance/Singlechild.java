package inheritance;

public class Singlechild extends Singleparent {
public void display(int a, int b)
{
int c=a+b;
System.out.println(c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singlechild obj=new Singlechild();
obj.display(4, 5);
obj.display();
Singleparent.sum(3, 4);
Singleparent obj1=new Singleparent();
obj1.display();
//obj.display(4,5) we cannot access child class property by creating the parent class object


	}

}
