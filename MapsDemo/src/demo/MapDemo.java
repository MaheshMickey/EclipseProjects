package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,String> stateCodes = new HashMap<String, String>();
//		stateCodes.put("MO", "Missouri");
//		stateCodes.put("MT", "Montana");
//		stateCodes.put("CA", "California");
//		
//		stateCodes.put("MO", "Mississippi");
//		System.out.println(stateCodes.size());
//		System.out.println(stateCodes);
//		System.out.println(stateCodes.keySet());
//		System.out.println(stateCodes.entrySet());
		
		
	    ArrayList<String> case_course_list = new ArrayList<String>();
	    
	    case_course_list.add("CapStone");case_course_list.add("CI");
	    case_course_list.add("CapStone");
	    case_course_list.add("BigData");case_course_list.add("WebApps");
	    
	    ArrayList<String> bandi_course_list = new ArrayList<String>();
	    
	    bandi_course_list.add("BigData");bandi_course_list.add("GDP2");
	    bandi_course_list.add("BigData");bandi_course_list.add("Java");
	    
	    ArrayList<String> hoot_course_list = new ArrayList<String>();
	    
	    hoot_course_list.add("ML");hoot_course_list.add("ML");
	    hoot_course_list.add("WebApps");hoot_course_list.add("WebApps");
	    hoot_course_list.add("DiscreteMath");
	    
	    Map<String,ArrayList<String>> course_map = new HashMap<String,ArrayList<String>>();
	    
	    course_map.put("Case", case_course_list);
	    course_map.put("Bandi", bandi_course_list);
	    course_map.put("Hoot", hoot_course_list);
	    
	    System.out.println(course_map);
	    
	    System.out.println("*************************************************");
	   int temp = 0;
	   
	   for(Entry<String, ArrayList<String>> e : course_map.entrySet())
	   {
//		  if(e.getValue().contains("BigData"))
//		  {
//			  System.out.println("Prof. Name is "+e.getKey());
//			  temp++;
//		  }
		   
	   }
	   System.out.println("Number of Proffesor's teaching BigData is: "+temp);
	   
	   System.out.println("*************************************************");
	   
//	   for(Map.Entry<String, ArrayList<String>> e : course_map.entrySet())
//		   {
//			  System.out.println(e.getKey() + e.getValue());
//		   }
	   
//	   System.out.println("********************************************");
		   
	   for(Map.Entry<String, ArrayList<String>> e : course_map.entrySet())
	   {
		   HashSet<String> hashSet = new HashSet<>(e.getValue());
		   
		   System.out.println(e.getKey()+ "-teaches" + hashSet);
		   
	   }
	   System.out.println("********************************************");
	   for(Map.Entry<String, ArrayList<String>> e : course_map.entrySet())
	   {
		   HashSet<String> hashSet = new HashSet<>(e.getValue());
		   
		   System.out.println(e.getKey()+ "-Courses" + hashSet);
		   System.out.println(hashSet.size());
	   }
		
	}

}
