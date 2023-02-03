package homeWork;

public class MultiThreading extends Thread{

	/*public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);//waiting for 0.5 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}*/
	public void run() {
		for (int i=0; i<3 ; i++)
			System.out.println("Thread in contol is"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MultiThreading t1 = new MultiThreading();
		MultiThreading t2 = new MultiThreading();

		t1.setName("Nikhil");
		t1.start();
		
		t2.setName("Sanjay");
		
	}
}
