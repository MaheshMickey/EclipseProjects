package stacksanddeques;

import java.util.Iterator;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganooori
 *
 */
public class GreetingsStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AStack<Character> greeting = new AStack<Character>();
		
		greeting.push('H'); greeting.push('a'); greeting.push('p');
		greeting.push('p');greeting.push('y');greeting.push(' ');
		
		greeting.push('N'); greeting.push('e'); greeting.push('w');
		greeting.push(' '); greeting.push('Y'); greeting.push('e');
		greeting.push('a'); greeting.push('r');
		
		printStack(greeting);
	}
	private static void printStack(AStack<Character> ch)
	{
		if(ch.isEmpty())
		{
			return;
		}
		else {
			char c = ch.getMyStack().pop();
			printStack(ch);
			
			System.out.println(c);
			ch.getMyStack().push(c);
		}
	}

}
