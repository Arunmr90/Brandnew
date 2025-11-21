package aggregation;

public class Agrechild {
	String subject;
	int mark;
	Agreparent ref;
	public Agrechild(String subject, int mark, Agreparent ref)
	{
		this.subject=subject;
		this.mark=mark;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(subject + " "+mark);
		System.out.println(ref.age+" "+ref.name);
		
	}

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
		Agreparent obj1=new Agreparent("Arun", 30);
Agrechild obj=new Agrechild("science", 50,obj1);
obj.display();
	}

}
