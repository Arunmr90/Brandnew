package accessspecifier2;

import accessspecifier.Modifier;

public class Outsideclass extends Modifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outsideclass obj=new Outsideclass();
				obj.pubmethod();
		obj.promethod();
	Modifier obj1=new Modifier();
	obj1.pubmethod();
	//private can only accessed within the class
	 
		

	}

}
