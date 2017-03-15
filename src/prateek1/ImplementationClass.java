package prateek1;

public class ImplementationClass {
	
	public static void main(String[] args) {
		ClassA a= new ClassA();
		ClassB b= new ClassB();
		
		System.out.println("ClassA i:"+a.i+" ClassA j:"+a.j+" ClassB i:"+b.i+" ClassB j:"+b.j);
		System.out.println(b.getClass());
		
		a=b;
		
		System.out.println(b.getClass());
		System.out.println(a.getClass());
		
		System.out.println("ClassA i:"+a.i+" ClassA j:"+a.j+" ClassB i:"+b.i+" ClassB j:"+b.j);
		System.out.println(a.equals(b));
		
	}

}
