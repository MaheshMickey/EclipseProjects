package sets;

import java.util.*;
import java.util.HashSet;

public class HashSetAndTreeSet {
	
	public static void main(String[] args)
	{
	HashSet<String> dogSet = new HashSet<String>();
	dogSet.add("Midge");
	dogSet.add("Zelda");
	dogSet.add("Eve");
	dogSet.add("Carmen");
	dogSet.add("Leonard");
	dogSet.add("Zelda");
	System.out.println("Dog set contains "
	+ dogSet.size() + " elements: "
	+ dogSet);
	System.out.println("Midge is in set: "
	+ dogSet.contains("Midge"));
	System.out.println("Odie is in set: "
	+ dogSet.contains("Odie"));
	dogSet.remove("Midge");
	System.out.println("Dog set contains "
	+ dogSet.size() + " elements: "
	+ dogSet);
	System.out.println("Midge is in set: "
	+ dogSet.contains("Midge"));
	TreeSet<String> catSet = new TreeSet<String>();
	catSet.add("Maude");
	catSet.add("Garfield");
	catSet.add("Button");
	catSet.add("Moskowitz");
	catSet.add("Albert");
	System.out.println();
	System.out.println(catSet);
	System.out.println();
	System.out.println("Maude is in set: "
	+ catSet.contains("Maude"));
	System.out.println("***************************");
	for (String cat : catSet)
	{
	System.out.println(cat);
	}
	System.out.println();
	Iterator<String> iter = catSet.iterator();
	while (iter.hasNext())
	{
	System.out.println(iter.next());
	}
	}
}
