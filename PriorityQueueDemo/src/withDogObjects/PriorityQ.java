package withDogObjects;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Dog> pqd = new PriorityQueue<Dog>();
		 Dog e = new Dog("Ruby",12);
		 Dog e1 = new Dog("Boogy",12);
		 Dog e2 = new Dog("Aspeer",13);
		pqd.add(e);
		pqd.add(e1);
		pqd.add(e2);
		//System.out.println(e1.getDogname());
		
		System.out.println(pqd);
	
		while(!pqd.isEmpty())
		{
			pqd.remove();
		}
		System.out.println(pqd);
	}
	

}
