package q14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q14UsingCopyOnWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<String>();
		c.add("PLayer"); c.add("PLayer2");
		
		Iterator i = c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
