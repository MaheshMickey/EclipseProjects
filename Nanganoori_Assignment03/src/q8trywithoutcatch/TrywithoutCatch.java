package q8trywithoutcatch;

public class TrywithoutCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=5;
			while(i>0)
			{
				System.out.println("WithIn try block");
				i--;
			}
		}
		//We can have a try without catch but we need to specify finally if we are not writing catch
		finally {
			System.out.println("Successfully out of try");
		}

	}

}
