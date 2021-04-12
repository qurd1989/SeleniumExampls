package threadCodes;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int x = 1; x<15; x++) {
			System.out.println("My runnable class " + Thread.currentThread());
			
		}
		
	}

}
