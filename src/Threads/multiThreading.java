package Threads;

//Using Thread class

public class multiThreading extends Thread{

	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);//waiting for 0.5 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		multiThreading t1 = new multiThreading();
		multiThreading t2 = new multiThreading();

		t1.setName("Nikhil");
		t1.start();
		
		t2.setName("Sanjay");
		t2.start();
		
		
		System.out.println(t1.getName());
		
	}
}
