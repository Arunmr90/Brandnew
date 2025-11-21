package samplecollections;


import java.util.ArrayList;
import java.util.List;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a =new ArrayList<String>();
		System.out.println(a);
		//add to add an elements into the collection
		a.add("red");
		a.add("yellow");
		a.add("blue");
		a.add("red");
		System.out.println(a);
		//indexof to return the index of the elements
		System.out.println(a.indexOf("yellow"));
		System.out.println(a.indexOf("red"));
		// LastIndexOf it is to return the index of elements,if there is return of the elements then it shows the last occurance
		System.out.println(a.lastIndexOf("black"));
		//Contains() to check whether a object is present or not
		System.out.println(a.contains("black"));
		//remove() 
		System.out.println(a.remove("blue"));
		System.out.println(a);
		System.out.println(a.remove(0));
		System.out.println(a);
		//get() to get the element based on index position
		System.out.println(a.get(1));
		for (int i=0; i<=1; i++ )
		System.out.println(a.get(i));
		for (String i:a)
		{
			System.out.println(i);
		}
			
	
		}

}
