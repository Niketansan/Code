package Oops;

class Ascend extends Thread{
	public void run() {
		for(int i = 1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
class Descend extends Thread{
	public void run() {
		for(int i = 100;i>=1;i--) {
			System.out.println(i);
		}
	}
}
public class ThreadImpl {
	
	
	public static void main(String[] args) {
		
		Ascend t1=new Ascend();
		Descend t2=new Descend();
		
		System.out.println("1st Thread:from 1 to 100");
		t1.start();
		System.out.println("2nd Thread:from 100 to 1");

		t2.start();
		
	}
}
