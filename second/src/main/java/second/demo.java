package second;

import java.util.ArrayList;
import java.util.HashMap;

public class demo {
	
	public static HashMap<String,Integer> foo(ArrayList<String> myl)
	{
		HashMap<String,Integer>m = new HashMap<String,Integer>();
		for(String s : myl)
		{
			if(!m.containsKey(s))
				m.put(s,0);
			m.put(s, m.get(s)+1);
		}
		System.out.println(m);
		return m;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> m1 = new ArrayList<>();
		m1.add("2");
		m1.add("4");
		System.out.println(m1);
	}

}
