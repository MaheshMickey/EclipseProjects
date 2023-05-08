/**
 * 
 */
package q17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author s546551
 *
 */
public class Q17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new HashMap<String,String>();
		m.put("Virat", "Kohli");
		m.put("Rohit", "Sharma");
		Iterator i = m.keySet().iterator();
		while(i.hasNext())
		{
			System.out.println(m.get(i.next()));
			m.put("Kl", "Rahul");
		}

	}

}
