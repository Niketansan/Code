package homeWork;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetImpl {

	public static void main (String[] args) {
		
		//Hash Set
		System.out.println("=====HashSet=====");
		Set hashSet= new HashSet();
		Set hashSet2=new HashSet();
		
		hashSet.add(1);
		hashSet.add("Hola");
		
		hashSet2.add("Est er des");
		hashSet2.add(07);
		
		System.out.println("Hash Set 1:"+hashSet);
		System.out.println("Hash Set 2:"+hashSet2);
		
		hashSet.addAll(hashSet2);
		System.out.println("Hash Set 1:"+hashSet);
		
		System.out.println(hashSet.contains(07));
		System.out.println(hashSet.equals(hashSet2));
		System.out.println(hashSet.hashCode());
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.size());
		System.out.println(hashSet.toString());
		
		//Linked Hash Set
		System.out.println("=====LinkedHashSet=====");
		Set LhashSet= new LinkedHashSet();
		Set LhashSet2=new LinkedHashSet();
		
		LhashSet.add(50);
		LhashSet.add("danke schon");
		
		LhashSet2.add("gutten morgen");
		LhashSet2.add(07);
		
		System.out.println("Hash Set 1:"+LhashSet);
		System.out.println("Hash Set 2:"+LhashSet2);
		
		LhashSet.addAll(LhashSet2);
		System.out.println("Hash Set 1:"+LhashSet);
		
		System.out.println(LhashSet.contains("gutten morgen"));
		System.out.println(LhashSet.equals(LhashSet2));
		System.out.println(LhashSet.hashCode());
		System.out.println(LhashSet.isEmpty());
		System.out.println(LhashSet.size());
		System.out.println(LhashSet.toString());
	}
}
 