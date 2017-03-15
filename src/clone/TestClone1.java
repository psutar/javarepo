package clone;

public class TestClone1 implements Cloneable {

	String a;
	int b;
	
	 TestClone1 cloneTest(){
		try {
			return (TestClone1)super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("exception:"+e.getMessage());
			return this;
		}
	}
	
}
