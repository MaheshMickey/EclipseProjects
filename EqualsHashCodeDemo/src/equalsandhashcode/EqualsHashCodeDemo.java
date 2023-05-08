package equalsandhashcode;

public class EqualsHashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String ("Hello");
        
        System.out.println((s1 == s2));
        System.out.println((s1.equals(s2)));
        
        System.out.println((s1 == s3));
        System.out.println((s1.equals(s3)));
        
        System.out.println("************");
        System.out.println((s1.hashCode()));
        System.out.println((s2.hashCode()));
        System.out.println((s3.hashCode()));
        
        System.out.println("****address******");
        System.out.println(Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(Integer.toHexString(System.identityHashCode(s2)));
        System.out.println(Integer.toHexString(System.identityHashCode(s3)));
        System.out.println("***********");
        Cat c1 = new Cat("puppy", 1);
        Cat c2 = new Cat ("RussianCat", 3);
        Cat c3 = c2;
        Cat c4 = new Cat ("puppy", 1);
        
        System.out.println((c2 == c3));
        System.out.println((c2.equals(c3)));
        
        System.out.println((c1 == c4));
        System.out.println((c1.equals(c4)));
        
        System.out.println("*****Hashcode of all cats****");
        System.out.println((c1.hashCode()));
        System.out.println((c2.hashCode()));
        System.out.println((c3.hashCode()));
        System.out.println((c4.hashCode()));
        
        System.out.println("****address of cats******");
        System.out.println(Integer.toHexString(System.identityHashCode(c1)));
        System.out.println(Integer.toHexString(System.identityHashCode(c2)));
        System.out.println(Integer.toHexString(System.identityHashCode(c3)));
        System.out.println(Integer.toHexString(System.identityHashCode(c4)));
       
        System.out.println("***********");
        
        
        System.out.println();
        
        
                
    }

}

