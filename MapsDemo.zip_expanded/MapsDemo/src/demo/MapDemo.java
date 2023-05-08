package demo;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> stateCodes=new HashMap<String,String>();
		stateCodes.put("MO", "Missouri");
		stateCodes.put("MT", "Montana");
		stateCodes.put("CA", "California");
		stateCodes.put("MO", "Mississippi");
		System.out.println(stateCodes.size());
		System.out.println(stateCodes);
		System.out.println(stateCodes.keySet());
		System.out.println(stateCodes.entrySet());
		
		ArrayList<String> caseList = new ArrayList<>();
		caseList.add("Capstone");
		caseList.add("CI");
		caseList.add("Capstone");
		caseList.add("BigData");
		caseList.add("Webapps");
		
		ArrayList<String> bandiList = new ArrayList<>();
		bandiList.add("BigData");
		bandiList.add("GDP2");
		bandiList.add("BigData");
		bandiList.add("Java");
		
		
		ArrayList<String> hootList = new ArrayList<>();
		hootList.add("ML");
		hootList.add("ML");
		hootList.add("Webapps");
		hootList.add("Webapps");
		hootList.add("DiscreteMath");
		
		Map<String, ArrayList<String>> courseMap=new HashMap<String,ArrayList<String>>();
		courseMap.put("Case", caseList);
		courseMap.put("Bandi", bandiList);
		courseMap.put("Hoot", hootList);
		System.out.println(courseMap);
		
		
		
//		//1 How many faculty are teaching BigData
//		int count=0;
//		for (Map.Entry<String, ArrayList<String>> entry : courseMap.entrySet()) {  
//            if(entry.getValue().contains("BigData")) {
//            	System.out.println(entry.getKey());
//            	count++;           	
//            }
//		}
//		System.out.println("Number of Faculty Teaching BigData is :" +count);
//		
//		//2
//		System.out.println("Case is teaching :" +caseList.size());
//		System.out.println("Bandi is teaching :" +bandiList.size());
//		System.out.println("Hoot is teaching :" +hootList.size());
//	
		
    
		// Question 1: How many faculty are teaching BigData?Who are they?
			
		System.out.println("********");
		whoTeach(courseMap, "BigData");
		System.out.println("********");
			

			// Question 2: How many courses each faculty is teaching?
			Set<String> facultySet = courseMap.keySet();
			for (String faculty : facultySet) {
				ArrayList<String> classesofFaculty = courseMap.get(faculty);
				System.out.println(faculty + ": " + classesofFaculty.size());
			}
			System.out.println("********");

			// Question 3: How many unique courses taught be each faculty
			for (String facultyName : courseMap.keySet()) {
				// get the values in a list and convert it to set.
				ArrayList<String> facultyCourses = courseMap.get(facultyName);
				HashSet<String> uniquecourses = new HashSet<String>(facultyCourses);
				System.out.println(facultyName + " teaches " + uniquecourses.size() + " unique classes. " + uniquecourses);
			}
		}

		private static void whoTeach(Map<String, ArrayList<String>> courseMap, String courseName) {
			int count = 0;
			for (String facultyName : courseMap.keySet()) {
				// For each key, we need to check the courseName.
				ArrayList<String> facultyCourses = courseMap.get(facultyName);
				if (facultyCourses.contains(courseName)) {
					count++;
					System.out.println(facultyName + " teaches " + courseName);
				}
			}
			System.out.println("A total of " + count + " faculty teaching " + courseName);
		}
	
	
	}


