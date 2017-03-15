package immutable;

public class ImmutableTest {

	public void call(){
		Student s = new Student(2,"chandana");
		System.out.println(s.getId());
	}
	
	public static void main(String[] args) {
		ImmutableTest it = new ImmutableTest();
		it.call();
	}

}
