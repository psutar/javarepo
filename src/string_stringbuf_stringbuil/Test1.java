package string_stringbuf_stringbuil;
/**
 * StringBuffer doesn't override equals(); its equals() method is the one inherited from java.lang.Object,
 * which returns true if and only if "==" would be true. String, on the other hand, does override equals();
 * its definition returns true of the two objects contain the same sequence of characters.
 * StringBuffer and StringBuilder are temporary buffers to hold a string while it is in its construction phase - not the finished product.
 * Hence the creators of StringBuffer and StringBuilder classes might have decided against overriding equals() method.
 * @author Prateek
 *
 */
public class Test1 {

	public static void main(String[] args) {
		System.out.println("******* String *********");
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("******* StringBUffer *********");
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println("******* StringBUilder *********");
		StringBuilder sbl1 = new StringBuilder("Java");
		StringBuilder sbl2 = new StringBuilder("Java");
		System.out.println(sbl1==sbl2);
		System.out.println(sbl1.equals(sbl2));
		

	}

}
