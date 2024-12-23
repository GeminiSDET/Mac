package JavaSapi;

import java.util.HashMap;
import java.util.Map;

//program to fetch the values from the map using keys

public class HashMapFetchValue {

	public static void main(String[] args) {

		Map<String,String> map=new HashMap<String, String>();
		map.put("Name", "John");
		map.put("City", "Chennai");
		map.put("Country", "India");
		map.put("Profession", "Engineer");
		
		System.out.println("Value for key 'Name':" + map.get("Name"));
		System.out.println("Value for key 'City':" + map.get("City"));
		System.out.println("Value for key 'Country':" + map.get("Country"));
		System.out.println("Value for key 'Profession':" + map.get("Profession"));
		System.out.println("Value for key 'Age':" + map.get("Age"));
	}

}
