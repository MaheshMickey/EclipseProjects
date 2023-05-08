package q5StringBufferAndBuilder;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer = new StringBuffer("Hello ");
		buffer.append("How are you ?");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Hey ");
		builder.append("What's your plan for today!?");
		System.out.println(builder);

	}

}
