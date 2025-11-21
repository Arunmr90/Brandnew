package samplecollections;

import java.util.HashSet;
import java.util.Set;

public class Setoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set <String>a=new HashSet<String>();	
   a.add("Obsqura");
   a.add("Kazhakootam");
   a.add("Trivandrum");
   a.add("Obsqura");
   System.out.println(a);
   Set <String>b=new HashSet<String>();
   b.add("Fan");
   b.add("Light");
   b.add("LED");
   System.out.println(b);
   System.out.println(a.addAll(b));
   System.out.println(a);
   System.out.println(a.contains("Obsqura"));
   System.out.println(a.containsAll(b));
   System.out.println(a.isEmpty());
   System.out.println(a.size());
   b.clear();
   System.out.println(b);
   System.out.println(a.remove("Obsqura"));
System.out.println(a);

	}

}
