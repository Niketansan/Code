package Oops;

class Threads implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<5 ; i++) {
			try {
				Thread.sleep(0);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}	
	}

	public static void main(String[] args) {

		Threads m=new Threads();

		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		//MyThread m=new MyThread();
		
		t1.setName("Nikhil");
		t1.start();
	
		t2.setName("Sanjay");
		t2.start();
		
	}
}
