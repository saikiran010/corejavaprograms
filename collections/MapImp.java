package collections;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "sai");
		map.put(3, "Kiran");
		map.put(2, "Akhi");
		map.put(1, "vish");

		System.out.println("Implementing HashMap :");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print("Id : " + entry.getKey());
			System.out.println(" \t Name : " + entry.getValue());
		}
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("B102", "Dosa");
		treeMap.put("L85", "Biryani");
		treeMap.put("B105", "Vada");
		treeMap.put("D73", "Roti-with curry");
		treeMap.put("L65", "Pannir butter masala");

		System.out.println("\nImplementing TreeMap :");
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.print("Id : " + entry.getKey());
			System.out.println(" \t Name : " + entry.getValue());
		}

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("In", "India");
		hashtable.put("Br", "Brazil");
		hashtable.put("De", "Germany");
		hashtable.put("Fr", "france");

		System.out.println("\nImplementing HashTable :");
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {
			System.out.print("Id : " + entry.getKey());
			System.out.println(" \t Name : " + entry.getValue());

		}
	}

}
