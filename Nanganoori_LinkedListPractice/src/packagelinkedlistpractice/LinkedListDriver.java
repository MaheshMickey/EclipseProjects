package packagelinkedlistpractice;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> actors = new LinkedList<String>();
		
		
		
		
		actors.add("Prabhas"); actors.add("Nani");actors.add("Nithin");
		actors.add("NTR"); actors.add("Ramcharan"); actors.add("Vijay");
		
		System.out.println(actors.size());
//		int i=6;
		
		for(int i=1 ;i<=actors.size();i++)
		{
			int x = actors.size()- i;
			System.out.println(actors.get(x));
		}
		
		Random random = new Random();
		int index = random.nextInt(actors.size());
		
		System.out.println(index);
		for(int i=0 ;i<index;i++)
		{
//			int x = actors.size()- i;
			System.out.println(actors.get(i));
		}
		
		System.out.println(actors.subList(index, actors.size()-1));
		//System.out.println(actors.subList(0, index));
		
		
		
		 
	}

}
