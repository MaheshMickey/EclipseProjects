package q25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Features {
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i=0;i<=2;i++) { l.add(i);}
		//ForEach Method in Iterable interface
		l.forEach(i -> System.out.println(i));
		
		
		//Optional<String>checkNull = Optional.ofNullable(str[5]);  
		
		//derived_class obj1 = new derived_class();
        //interface_default  ref = obj1::classMethod; 

	}	

}
