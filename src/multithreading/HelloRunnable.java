package multithreading;

public class HelloRunnable implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		(new Thread(new HelloRunnable())).start();

	}

	@Override
	public void run() {
		System.out.println("Hello Runnable");
	}

}
