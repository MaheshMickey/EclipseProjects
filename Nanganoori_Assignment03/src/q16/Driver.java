package q16;

import java.util.HashMap;
import java.util.Map.Entry;

public class Driver {
		public static void main(String[] args)
		{
			//Employee e = new Employee("OO");
			//creating a HashMap of type employee 
			
			HashMap<String,String> hm = new HashMap<String,String>();
			
			//adding elements into a hashmap
			hm.put("Rangers", "POWER");
			
			//To retrieve only the keys present in hashmap we use KeySet() 
			System.out.println("Key : "+hm.keySet());
			//To retrives the values present in hashmap we use values()
			System.out.println("Values : "+hm.values());
		}
}
