package homeWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		System.out.println("===== HASH MAP =====");
		Map HashMap1 = new HashMap();
		Map HashMap2 = new HashMap();
		
		HashMap1.put(20,"Nikhil");
		HashMap1.put(1,"Sanjay");
		
		HashMap2.put(100,"Prasanth");
		HashMap2.put(4,"Kumar");
		
		System.out.println("HashMap1:"+HashMap1);
		System.out.println("HashMap2:"+HashMap2);
		
		HashMap1.putAll(HashMap2);
		System.out.println("HashMap1:"+HashMap1);
		
		
		System.out.println(HashMap1.containsKey(3));
		System.out.println(HashMap1.hashCode());
		System.out.println(HashMap1.entrySet());
		System.out.println(HashMap1.toString());
		System.out.println(HashMap1.size());
		System.out.println(HashMap1.values());
		HashMap1.remove(1,"Hi");
		System.out.println("HashMap1:"+HashMap1);
		HashMap1.remove(1, "Sanjay");
		System.out.println("HashMap1:"+HashMap1);
		
		
		System.out.println("===== Linked HASH MAP =====");
		Map LHashMap1 = new LinkedHashMap();
		Map LHashMap2 = new LinkedHashMap();
		
		LHashMap1.put(20,"Sai");
		LHashMap1.put(1,"Ram");
		
		LHashMap2.put(100,"Krishna");
		LHashMap2.put(4,"Valluri");
		
		System.out.println("LinkedHashMap1:"+LHashMap1);
		System.out.println("LinkedHashMap2:"+LHashMap2);
		
		LHashMap1.putAll(LHashMap2);
		System.out.println("LinkedHashMap1:"+LHashMap1);
		
		
		System.out.println(LHashMap1.containsKey(3));
		System.out.println(LHashMap1.hashCode());
		System.out.println(LHashMap1.entrySet());
		System.out.println(LHashMap1.toString());
		System.out.println(LHashMap1.size());
		System.out.println(LHashMap1.values());
		LHashMap1.remove(1,"Hola");
		System.out.println("LinkedHashMap1:"+LHashMap1);
		LHashMap1.remove(1, "Ram");
		System.out.println("LinkedHashMap1:"+LHashMap1);

		
		System.out.println("===== HASH TABLE =====");
		Map HashTable1 = new Hashtable();
		Map HashTable2 = new Hashtable();
		
		HashTable1.put(20,"HI");
		HashTable1.put(1,"Hola");
		
		HashTable2.put(100,"Kavya");
		HashTable2.put(4,"Sree");
		
		System.out.println("HashTable1:"+HashTable1);
		System.out.println("HashTable2:"+HashTable2);
		
		HashTable1.putAll(HashTable2);
		System.out.println("HashTable1:"+HashTable1);
		
		
		System.out.println(HashTable1.containsKey(3));
		System.out.println(HashTable1.hashCode());
		System.out.println(HashTable1.entrySet());
		System.out.println(HashTable1.toString());
		System.out.println(HashTable1.size());
		System.out.println(HashTable1.values());
		HashTable1.remove(1,"Hi");
		System.out.println("HashTable1:"+HashTable1);
		HashTable1.remove(1, "Hola");
		System.out.println("HashTable1:"+HashTable1);
				
	}

}
