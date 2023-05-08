package queue;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 */
public class Q {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LinkedBlockingQueue<String> actors = new LinkedBlockingQueue<String>(5);
		Set<String> set1 = new HashSet<String>();
		
		actors.put("RamCharan");
		System.out.println(actors.remainingCapacity());
		actors.put("Prabhas");
		System.out.println(actors.remainingCapacity());
		actors.put("MaheshBabu");
		System.out.println(actors.remainingCapacity());
		actors.put("NTR");
		System.out.println(actors.remainingCapacity());
		actors.put("Nani");
		System.out.println(actors.remainingCapacity());
		
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Waiting for 5 seconds and trying to add using offer method: " + actors.offer("VijayDevarakonda"));
		
		try {
			actors.add("Nithin");
		}
		catch(Exception e){
			System.out.println("Exception : "+e);
		}
		
		System.out.println("When we used Offer Method it only returns boolean value but doesnt display any exception only returns true or false\n"
				+ "Where as in add method we are trying to add and the queue is full so it will directly throw exception");
	
		for(String s : actors)
		{
			int i=0;
			for(String s1 : actors) {
				if(s == s1)
				{
					i++;
				}
			}
			if(i>=2)
			{
				set1.add(s);
			}
		}
		for(String q:set1)
		{
			System.out.println(q);
		}
		System.out.println("Using poll()"+actors.poll());
		System.out.println("Using remove()"+actors.remove());
		actors.clear();
		System.out.println("Using Queue's peek()"+actors.peek());
		try {
			System.out.println("Using element()"+actors.element());
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		
		

	}

}
