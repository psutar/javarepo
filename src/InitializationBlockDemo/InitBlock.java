package InitializationBlockDemo;
/**
 * Below code demostrates the hierarchy of the methods called when an object is 
 * created for a paticular class.
 * 1. Static Block
 * 2. Superclass Constructor
 * 3. Initiation Block
 * 4. Same Class Constructor
 * @author Prateek
 *
 */
public class InitBlock extends SuperClass{

	private static String name;
	InitBlock(int x){
		System.out.println("in 1 parameter constructor :"+this.name+"   "+x);
	}
	InitBlock(){
		name = "Prateek";
		System.out.println("in no arguement constructor :"+name);
	}
	
	//1st static block
	static{
		name = "sutar";
		System.out.println("in 1st static block : " + name);
	}
	//1st initiator block
	{
		//name="nalini";
		System.out.println("1st initiator block :"+name);
	}
	//2nd initiator block
	{
		System.out.println("2nd initiator block");
	}
	static{
		System.out.println("in 2nd static block : ");
	}
	public static void main(String[] args) {
		new InitBlock();
		System.out.println("**************************************");
		new InitBlock();
		System.out.println("#######################################");
		new InitBlock(7);
		System.out.println("in main :"+name);
	}

}
