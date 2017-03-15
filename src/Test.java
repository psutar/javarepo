public class Test extends SupetTest{
	

	public static void main(String[] args) {
		String s1 = new String("Prateek");
		String s2 = new String("Prateek");
		String s3="Sutar";
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode() == s3.hashCode());
		for (int i = 0; i < 10; i++) {
		String s = new String("Prateek");	
		
		System.out.println(s.hashCode());
		}
	}
	}


