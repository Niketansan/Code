package Oops;

class Table {
	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			} // for
		} // synchronized
	}// printTable
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		System.out.println("Thread1 running and printing table of 5");
		
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		System.out.println("Thread2 running and printing table of 6");
		t.printTable(6);
		

	}
}

class TestSynchronizedBlock {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}