package abstract_interface_test;

public class Test extends TestAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.a();
		t.b();
		t.c();
		t.d();
		t.e();

	}

	@Override
	public void a() {
		System.out.println("in a");

	}

	@Override
	public void b() {
		System.out.println("in b");

	}

	@Override
	public void d() {
		System.out.println("in d");

	}

	@Override
	public void f() {
		System.out.println("in f");

	}

	@Override
	public float g() {
		// TODO Auto-generated method stub
		return 0;
	}

}
