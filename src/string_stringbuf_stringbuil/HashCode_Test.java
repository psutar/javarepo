package string_stringbuf_stringbuil;
/**
 * String returns new hashcode value when you concat string but StringBuffer returns same.
 * @author Prateek
 *
 */
public class HashCode_Test {

	public static void main(String[] args) {
		System.out.println("String Hash Code");
		String s = "Java";
		System.out.println(s.hashCode());
		s=s+"test";
		System.out.println(s.hashCode());
		System.out.println("StringBuffer Hash Code");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.hashCode());
		sb=sb.append("test");
		System.out.println(sb.hashCode());
		System.out.println("StringBuilder Hash Code");
		StringBuilder sbl = new StringBuilder("Java");
		System.out.println(sbl.hashCode());
		sbl=sbl.append("test");
		System.out.println(sbl.hashCode());
	}

}
