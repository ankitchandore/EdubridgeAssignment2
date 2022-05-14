package arraylist;

import java.util.ArrayList;

public class CharArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Character> list=new ArrayList<Character>(2);//array capacity is 2 
		list.add('A');
		list.add('n');
		list.add('c');
		list.add('i');
		list.add('s');
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(2,'k');
		list.add(4,'t');
		System.out.println(list);
		list.remove(3);
		list.remove(5);
		System.out.println(list);
		list.remove(4);
		list.add(3, 'i');
		int v=list.size();
		System.out.println(v);//size is 5 if the capacity of arraylist is over the it grow the block 
		System.out.println(list);
		for(char i:list) {    //enhance loop 
			System.out.println(i);
			
			
		}
	    boolean U=list.contains('t');
		boolean y=list.contains('w');
		System.out.println(list);
		System.out.println(U);
		System.out.println(y);
		boolean z=list.isEmpty();
		System.out.println(z);
		int a=list.indexOf('n');
		System.out.println(a);
		int b=list.lastIndexOf('n');
		System.out.println(b);
		list.add(' ');
		
		ArrayList <Character> list1=new ArrayList<Character>(2);
		list1.add('c');
		list1.add('h');
		list1.add('a');
		list1.add('n');
		list1.add('d');
		list1.add('r');
		list1.add('e');
		System.out.println(list1);
		list1.add(5,'o');
		System.out.println(list1);
		
	boolean p=list.addAll(list1);
		System.out.println(p);
		list.addAll(list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
				

	}
	
}

     
