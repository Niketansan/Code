package homeWork;
import java.util.Scanner;
public class Calculator {
	
	

	public static void main(String[] args) {
		int num1,num2,choice,result=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nChoose from the menu:\n 1.Add\n2.Subtract\n3.Product\n4.Divide\n");
			choice=sc.nextInt();
			
			System.out.println("Enter first number:\n");
			num1 = sc.nextInt();
			
			System.out.println("Enter Second number:\n");
			num2 = sc.nextInt();
		}
		switch(choice) {
	    case 1:
	    	add(num1,num2);
			System.out.println(result);
	    	break;
	    case 2:
	    	substract(num1,num2);
	    	break;
	    case 3:
	    	product(num1,num2);
	    	break;
	    case 4:
	    	divide(num1,num2);
	    	break;
	    default:
	    	System.out.println("Invalid Input");
	    }
	}
	
	public static void add(int num1, int num2){
		int result=0;
		result = num1+num2;
		System.out.println(result);
	}
	
	public static void substract(int num1, int num2){
		int result=0;
		result = num1-num2;
		System.out.println(result);
	}
	
	public static void product(int num1, int num2){
		int result=0;
		result = num1*num2;
		System.out.println(result);
	}
	
	public  static void divide(int num1 , int num2){
		
		int result=0;
		result = num1/num2;
		System.out.println(result);
	}
	
}
