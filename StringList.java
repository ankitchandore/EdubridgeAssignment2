package arraylist;

import java.util.ArrayList;

public class StringList {

	public static void main(String[] args, int j) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		System.out.println(" before my best frd List");
		list.add("ankit");
		list.add("rahul");
		list.add("Rohit");
		list.add("pys");
		list.add("monika");
		list.add("pranav");
		list.add("sahil");
		System.out.println(list);
		String y=list.get(2);
		System.out.println(y);
		list.add(2,"Akshay");
		System.out.println(list);
		list.set(3,"chinu");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		int size=list.size();
		System.out.println("size"+" "+size);
		System.out.println("after my best frd list is");
		//for (int i=0;i<list.size(); i++);
		//System.out.println(list.get(size));
		
		
		
		
		
		
		
		

	}

}

