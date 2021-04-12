package threadCodes;

public class RunMyRunnable {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
	
		
		Thread r1 = new Thread(myRunnable);
		
		r1.setName("Run -1 Thread");
		
		//starting Thread 
		r1.start();
		
		Thread r2 =new Thread(myRunnable);
		
		r2.setName("Run- 2 Thread");
		r2.start();
	}
}
