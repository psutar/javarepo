package prateek;

public class TestInterfaceImpl implements TestInterface {

	@Override
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("inside TestInterfaceImpl  sum ="+c);
		
	}

}
