package Verification;
import java.util.Scanner;
public class Details {
	String full_Name,address;
	String aadhar_id,mobile_number;
	int age ;
String  creationType ;

	/*public void details() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Full Name:\t");
		String full_Name=sc.nextLine();
		System.out.println("Enter 10 digit Mobile Number:\t");
		String mobile_number=sc.nextLine();
		System.out.println("Enter Address:\t");
		String address=sc.nextLine();
		System.out.println("Enter Aadhar_Id:\t");
		String aadhar_id=sc.nextLine();
		System.out.println("Enter Age:\t");
		int age=sc.nextInt();
		}
		*/
		
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter Full Name:\t");
			String full_Name=sc.nextLine();
			System.out.println("Enter 10 digit Mobile Number:\t");
			String mobile_number=sc.nextLine();
			System.out.println("Enter Address:\t");
			String address=sc.nextLine();
			System.out.println("Enter Aadhar_Id:\t");
			String aadhar_id=sc.nextLine();
			System.out.println("Enter Age:\t");
			int age=sc.nextInt();
			
			
			Details  dt = new Details()
					
				
			
		}



	public String getFull_Name() {
		return full_Name;
	}



	public void setFull_Name(String full_Name) {
		this.full_Name = full_Name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getAadhar_id() {
		return aadhar_id;
	}



	public void setAadhar_id(String aadhar_id) {
		this.aadhar_id = aadhar_id;
	}



	public String getMobile_number() {
		return mobile_number;
	}



	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
}
