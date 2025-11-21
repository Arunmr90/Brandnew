package stringprogram;

public class String_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "obscura";
		System.out.println(s);
		String a=new String ("Full");
		System.out.println(a);
		//length()
		System.out.println(s.length());
		System.out.println(a.length());
		//concat()to add two srings
		System.out.println(s.concat(a));
		System.out.println(s);
		//charAt() is used to return the character based on index
		System.out.println(s.charAt(4));

	}
}