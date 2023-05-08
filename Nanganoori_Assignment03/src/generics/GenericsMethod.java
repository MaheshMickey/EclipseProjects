/**
 * 
 */
package generics;

/**
 * @author S546551
 *
 */
public class GenericsMethod {

	/**
	 * @param args
	 */

	//Generics are parameterized types. Basic idea is to allow type to be 
	//parameter to methods, classes, and interfaces.
	public static <E> void printA(E[] in)
	{
		for(E el : in)
		{
			System.out.println(el);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] inte = {1,2,3};
		System.out.println("In integer Array");
		printA(inte);

	}

}
