import java.util.HashSet;
import java.util.Stack;
import java.util.TreeMap;

public class MapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeMap<String,String> stateCodes = new TreeMap<String,String>(); 
//		
//		stateCodes.put("Missouri", "MO");
//		stateCodes.put("Texas", "TX");
//		stateCodes.put("California", "CA");
//		stateCodes.put("NewYork", "NY");
//		
//		System.out.println("The Key For Texas is : "+stateCodes.get("Texas"));
//		
//		System.out.println("States :"+stateCodes.keySet());
//		System.out.println("States :"+stateCodes.values());
//		System.out.println(stateCodes);
//		System.out.println("Mappings :"+stateCodes.entrySet());
//		
//		stateCodes.remove("NewYork");
//		System.out.println(stateCodes);
//		System.out.println("Mappings :"+stateCodes.entrySet());
		
		Stack<String> myStack = new Stack<String>();
		myStack.push("Fun");
		myStack.push("Is");
		myStack.push("Science");
		myStack.push("Computer");
		System.out.print(myStack.peek() + " "); 
		myStack.pop();
		System.out.print(myStack.peek() + " "); 
		myStack.pop();
		System.out.print(myStack.peek() + " "); 
		myStack.pop();
		System.out.print(myStack.peek()); 
		myStack.pop();
		System.out.println();
		
		
	}

}
