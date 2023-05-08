package worksheet01maps;

import java.util.Map;
import java.util.TreeMap;

public class MapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> stateCodes = new TreeMap<String,String>();
		stateCodes.put("Missouri", "MO");
		stateCodes.put("Texas", "TX");
		stateCodes.put("California", "CA");
		stateCodes.put("New York", "NY");
		
		whichState(stateCodes,"Texas");
		System.out.println("States: "+stateCodes.keySet());
		System.out.println("Codes: "+stateCodes.values());
		System.out.println("Mappings: "+stateCodes.entrySet());
		stateCodes.remove("New York");
		System.out.println("Mappings :"+stateCodes.entrySet());
	}
		

	private static void whichState(Map<String, String> stateCodes, String stateName) {
		// TODO Auto-generated method stub
		for(String sName:stateCodes.keySet()) {
			String sCode = stateCodes.get(sName);
			if(sName.contains(stateName)) {
				System.out.println("The code for "+stateName + " is " +sCode);
			}
		}
		
		
	}

}
