package Oops;

public class ExceptionhandleTest {
	public static void main(String[] args) {
		System.out.println("hi");
		try {
			//add();
			
			String ageLimitCheck = ageLimitCheck(19);
			System.out.println(ageLimitCheck);
		
		}
		catch (Exception e) {
			e.printStackTrace();

		}
		
		System.out.println("21231321");

	}

	public static void add()throws Exception {
		try {
			int a = 10;
			int c = a / 0;
			System.out.println(c);
		}catch(ArithmeticException e) {
			
			throw new ArithmeticException(" Unable to divide by zero");
			
		}
		catch (Exception e) {

			throw new Exception(" Unable to divide by zero");
		}

	}

	public static String ageLimitCheck(int age) throws AgeLimitExcpetion {

		if (age >=18) {
			System.out.println("Welcome to the Party ");
		} else {
			throw new AgeLimitExcpetion("Age is less than 18");
		}
		return "Completed";
		
	}//System.out.println
}
