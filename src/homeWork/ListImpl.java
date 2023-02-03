package homeWork;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ListImpl {

	public static void main(String[] args) {
		
		//Array Lists
		System.out.println("=====Array Lists=====");
		List arrlist = new ArrayList();
		List arrList2=new ArrayList();
		
		arrlist.add(1);
		arrlist.add(1, 7);
		arrlist.add(0, "Hi");
		
		arrList2.add("Hello");
		arrList2.add(1,102);
		
		System.out.println("Array List 01:"+arrlist);
		System.out.println("Array List 02:"+arrList2);
		arrlist.addAll(arrList2);
		System.out.println("Array List 01:"+arrlist);
		
		System.out.println(arrlist.contains("Hi"));
		System.out.println(arrlist.containsAll(arrList2));
		System.out.println(arrlist.get(0));
		System.out.println("Hashcode:"+arrlist.hashCode());
		System.out.println(arrlist.indexOf("Hello"));
		System.out.println(arrlist.isEmpty());
		System.out.println(arrlist.lastIndexOf(7));
		arrlist.remove(4);
		System.out.println("Array List 01:"+arrlist);
		System.out.println( arrlist.size());

		
		//Linked List
		System.out.println("=====Linked Lists=====");
		
		List linkedlist = new LinkedList();
		List linkedlist2=new LinkedList();
		
		linkedlist.add(10);
		linkedlist.add(1, 97);
		linkedlist.add(0, "Bye");
		
		linkedlist2.add("Sweet Dreams");
		linkedlist2.add(1,8);
		
		System.out.println("Linked List 01:"+linkedlist);
		System.out.println("Linked List 02:"+linkedlist2);
		arrlist.addAll(linkedlist2);
		System.out.println("Linked List 01:"+linkedlist);
		
		System.out.println(linkedlist.contains("Bye"));
		System.out.println(linkedlist.containsAll(linkedlist2));
		System.out.println(linkedlist.get(0));
		System.out.println("Hashcode:"+linkedlist.hashCode());
		System.out.println(linkedlist.indexOf("Bye"));
		System.out.println(linkedlist.isEmpty());
		System.out.println(linkedlist.lastIndexOf(97));
		System.out.println("Linked List 01:"+linkedlist);
		System.out.println( linkedlist.size());
	
		//Vector
		System.out.println("=====Vectors=====");
		List vector = new Vector();
		List vector2 = new Vector();
		vector.add(69);
		vector.add(96);
		vector.add(0, "hola");
		
		vector2.add("Gutten Morgen");
		vector2.add(0,109);
		
		System.out.println("vector 01:"+vector);
		System.out.println("vector 02:"+vector2);
		vector.addAll(vector2);
		System.out.println("vector 01:"+vector);
		
		System.out.println(vector.contains("hola"));
		System.out.println(vector.containsAll(vector2));
		System.out.println(vector.get(0));
		System.out.println("Hashcode:"+vector.hashCode());
		System.out.println(vector.indexOf(109));
		System.out.println(vector.isEmpty());
		System.out.println(vector.lastIndexOf("hola"));
		System.out.println("vector 01:"+vector);
		System.out.println( vector.size());
		
		
		//Copy On Write Array List
		System.out.println("=====Copy On Write Array Lists=====");
		List cow = new CopyOnWriteArrayList();
		List cow2 = new CopyOnWriteArrayList();
		cow.add(100);
		cow.add(169);
		cow.add(0, "GO");
		
		cow2.add(" AMERICANA");
		cow2.add(0,109);
		
		System.out.println("COW Array List 01:"+cow);
		System.out.println("COW Array List 02:"+cow2);
		cow.addAll(cow2);
		System.out.println("COWArray List 01:"+cow);
		
		System.out.println(cow.contains("AMERICANA"));
		System.out.println(cow.containsAll(cow2));
		System.out.println(cow.get(0));
		System.out.println("Hashcode:"+cow.hashCode());
		System.out.println(cow.indexOf(169));
		System.out.println(cow.isEmpty());
		System.out.println(cow.lastIndexOf("GO"));
		System.out.println("COW Array List 01:"+cow);
		System.out.println( cow.size());
		
		
	}

}
