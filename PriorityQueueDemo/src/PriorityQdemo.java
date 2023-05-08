import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> languages = new PriorityQueue<>();
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>(10);
		languages.add("English");languages.add("French");languages.add("Spanish");
		languages.add("Hindi");
		languages.add("Tamil");
		languages.add("Telugu");
		System.out.println(languages);
		languages.remove("Hindi");
		System.out.println(languages);
		
		numbers.add(73);numbers.add(77);numbers.add(89);numbers.add(52);
		 Iterator i = numbers.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 System.out.println(numbers);
		 numbers.remove(73);
		 System.out.println(numbers);
		 
		 while(!languages.isEmpty())
		 {
			 languages.poll();
		 }
		 System.out.println(languages);
//		 for(int i1=0;i1<languages.size();i1++)
//		 {
//			 languages.poll();
//		 }
		 System.out.println(languages.size());
		
		
	}

}
