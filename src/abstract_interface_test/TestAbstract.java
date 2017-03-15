package abstract_interface_test;

public abstract class TestAbstract implements TestInterface {
	
	public void c(){
		System.out.println("in c");
	}
	public void e(){
		System.out.println("in e");
	}
	public abstract void f();

	abstract public float g();
}
