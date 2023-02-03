package Oops;
import Practice.*;
class Nikhil extends Demo{
	
}
class j {

	void julia(int m,String k) {
		System.out.println(m+""+k);
	}
}
interface Calcu{
	int a= 15;
	public void add();
	public void subtract();
}

interface A{
	int i=0;
}
interface B extends A{
	
}
class C implements A{
	
}
/*class C extends Calcu {

	@Override
	public void add() {
		System.out.println("HI");

		
	}
	

	
	public void nik() {
		add();
		super.add();		

	} 
	
}*/
class calc  implements Calcu{
	int a=3;	
	int c=a+1;
	
	public void add() {
		int a=2;
		
	}

	
	public void subtract() {
		
	}

	
	
}
	
public class Interfaces implements A {
	public static void main(String[] args) {
		//Calcu c1 = new Calcu();
		//C c2 = new C();
		
		System.out.println(i);
		
		j ju = new j();
		int z=10;
		ju.julia(z,"Messi");
		
		
		
		
		
		
	}

}

/*class Parent{
	int p=0;
	
     void display(){
          System.out.println("Parent class display method is called");
          p=p+1;
      }
    
}
class Child extends Parent{
    public void show(){
          System.out.println("Child class show method is called");
    }
    
    	
    
}
class Interfaces{
    public static void main(String[] args){
        Parent p; //Parent class reference variable
        Child c = new Child();// Child class object
        p = c;  //p contain reference of Child class object
        p.display();// display() method of Parent class is invoked
        c.show();// show() method of Child class is invoked
        }
}*/