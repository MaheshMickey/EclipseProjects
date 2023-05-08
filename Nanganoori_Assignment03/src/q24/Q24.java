package q24;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    final int age = 10;
			try {
				int i = 0;
				while(i<5)
				{
					System.out.println(i);
					i++;
					System.gc();
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception"+e);
			}


	}

}
