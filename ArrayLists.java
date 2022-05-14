
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static  void  main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();//ArrayList can store only predefine class.we can store any type of object like student ,Integer
		list.add(0);  //add is fun to add value in arrayList
		list.add(5);
		list.add(6);
		list.add(650);
		list.add(55);
		list.add(46);
		System.out.println(list); 
		int x=list.get(2);   //to check the index
		System.out.println(x);
		list.add(2, 8);       // to add the the element in index
		System.out.println(list);
		list.set(2,9);       //replace the the element of the index
		System.out.println(list);
		list.remove(3);   //to remove the index (3) element
		list.remove(0);   //to remove element (0)index
		System.out.println(list);
		int y=list.size(); //to check the size of element
		System.out.println(y);
		for(int i=0;i<list.size();i++) {      //to display the value of Arraylist by the index
			System.out.println(list.get(i));
			
		}
		Collections.sort(list);    //this convert to asending order
		System.out.println(list);
		
		
		
}
}



