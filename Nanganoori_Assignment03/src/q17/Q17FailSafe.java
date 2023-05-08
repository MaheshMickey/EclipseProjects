package q17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q17FailSafe {
	 public static void main(String[] args)
	    {
		 	CopyOnWriteArrayList<Integer> l = 
		 			new CopyOnWriteArrayList<Integer>(new Integer[] {1,2,3,4});
		 	Iterator i = l.iterator();
		 	while(i.hasNext())
		 	{
		 		Integer i1 = (Integer)i.next();
		 		System.out.println(i1);
		 		if(i1 == 2)
		 		{
		 			l.add(5);
		 		}
		 	}
	    }
}
