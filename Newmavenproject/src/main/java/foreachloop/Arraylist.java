package foreachloop;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList <String> a=new ArrayList<String>();
		a.add("Arun");
		a.add("Shivadev");
		a.add("Sachin");
		System.out.println(a);
		ArrayList <String> b=new ArrayList<String>();
		b.add("Truck");
		b.add("Bus");
		b.add("Car");
		System.out.println(b);
		//addAll is to combine two list
		System.out.println(a.addAll(b));
		System.out.println(a);
		//containsAll is to check one list in another list
		System.out.println(b.containsAll(a));
		System.out.println(a);
		//isEmpty is to check whether a List is empty or not
		System.out.println(a.isEmpty());
		//size is to return the length of the list
		System.out.println(a.size());
		//Iterator it is an interface used to itrate the collection elements
		Iterator <String>i= a.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());
					
				}
				i.remove();
				System.out.println(a);
              
	}

}
