package Threads;
//using Runnable Interface
public class multiThreading2 implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<5 ; i++) {
			try {
				Thread.sleep (1000);
				
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}	
	}

	public static void main(String[] args) {

		multiThreading2 t1 = new multiThreading2();
		

		Thread m = new Thread(t1);
		Thread m1= new Thread(t1);
		m.start();
		
	}
}
