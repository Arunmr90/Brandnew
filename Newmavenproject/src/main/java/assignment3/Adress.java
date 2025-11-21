package assignment3;

public class Adress {
	String Adress;
	Student ref;
	public Adress(String Adress,Student ref) {
		this.Adress=Adress;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(Adress);
		System.out.println(ref.name+ " "+ ref.rollnumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student obj=new Student("Sachin",112 );
	Adress obj1=new Adress("Vizhinjam", obj);
	obj1.display();
	}
	  

}
