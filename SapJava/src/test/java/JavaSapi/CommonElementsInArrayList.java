package JavaSapi;

import java.util.ArrayList;

public class CommonElementsInArrayList {

	// program to find the common elements between two ArrayLists
	
	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(60);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(20);
		list2.add(40);
		list2.add(60);
		list2.add(77);
		
		
		ArrayList<Integer> commonElements=new ArrayList<Integer>(list1);
		commonElements.retainAll(list2);
		
		System.out.println("Common ELements are: " + commonElements);

		
	}

}
