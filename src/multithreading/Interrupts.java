package multithreading;

public class Interrupts {

	public static void main(String[] args){
		
		 String importantInfo[] = {
		            "Mares eat oats",
		            "Does eat oats",
		            "Little lambs eat ivy",
		            "A kid will eat ivy too"
		        };
		 for (int i = 0; i < importantInfo.length; i++) {
				 //Pause for 4 seconds
		            try {
						Thread.sleep(4000);
						 //Print a message
			            System.out.println(importantInfo[i]);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		           
		            if (Thread.interrupted()) {
		                try {
							throw new InterruptedException();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            } 
	            
	        }
	}

}
