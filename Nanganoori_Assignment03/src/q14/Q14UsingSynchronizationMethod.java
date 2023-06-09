package q14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class Q14UsingSynchronizationMethod {

	public static void main(String[] args) {
	List<String> list = Collections.synchronizedList(new ArrayList<String>());
	list.add("cricket");
	list.add("basketball");
	
	synchronized(list)
	{
		Iterator it =  list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	}
}
