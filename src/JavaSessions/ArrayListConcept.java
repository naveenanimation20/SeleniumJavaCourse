package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		//ArrayList is a class in Java
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size()); //size of arraylist
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.remove(3);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(12.33);
		ar.add('M');
		ar.add(25);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
		
		//System.out.println(ar.get(10)); //IndexOutOfBoundsException
		
		//to print all the values: use for loop:
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		
	}

}
