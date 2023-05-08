package sampleregex;

public class SampleRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String password = "pasword12";
		//String password = "P123@@word";
		//String password = "P1sswORD";
		String p = "Good qwdq";
		String q = "vuqyv happy";
		//String p = "Aw126";
		
		 //String pattern = "^Good.*\\b";
		String pattern = "\\b.*happy$";
		 //([a-z]*)
		 
		 if(q.matches(pattern))
		 {
			 System.out.println("Valid");
		 }
		 else {
			 System.out.println("Invalid");
		 }

	}

}
