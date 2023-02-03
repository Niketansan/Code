package homeWork;

public class AadharCardDetails {
	String full_name,address;
	String aadhar_id,mobile_number;
	int age ;
	//age
	public boolean eligibleForVotingOrNot(int age){
		if(age>=18)
			return true;
		else
			return false;
	}
	//name
	public String getFullName(String full_name){
		
		return full_name;
	}
	//aadharId
	public boolean aadharLength(String aadhar_id) {
		int length = aadhar_id.length();
		if(length==12) 
			return true;
		else if(length==0){
			System.out.println("Empty");
			return false;
		}
		else if(length>12) {
			System.out.println("Length is exceeded");
			return false;
		}
		else if(length<12) {
			System.out.println("Length is less");
			return false;
		}
		return false;			
	}
	//mobileNumber
	public boolean verifyMobile(String mobile_number) {
		int len=mobile_number.length();
		if (len==10)
			return true;
		else
			return false;
	}
	//address
	public boolean verifyAddress(String address) {
		if (address.length()<=100)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) 
	{
		AadharCardDetails a = new AadharCardDetails();
		a.aadhar_id="767914583950";
		a.age=18;
		a.mobile_number="6281601214";
		a.full_name="Valluri Nikhil Sanjay";
		a.address="23-2-17\nBhagat Singh Road\nVijayawada\n520011";
		//age
		boolean eligible=a.eligibleForVotingOrNot(a.age);
		if (eligible) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not Eligible For Voting");
		}
		//name
		String fullName = a.getFullName(a.full_name);
		System.out.println(fullName);
		//aadharId
		boolean validAadhar=a.aadharLength(a.aadhar_id);
		if(validAadhar) {
			System.out.println("Valid -\t Aadhar Verified");
		}
		else
			System.out.println("Invalid");
		//Mobile
		boolean validMobile=a.verifyMobile(a.mobile_number);
		if (validMobile)
			System.out.println("Number Verified");
		else
			System.out.println("Number Not Verified");
		//address
		boolean validAddress=a.verifyAddress(a.address);
		if(validAddress)
			System.out.println("Address is valid");
		else
			System.out.println("Length Exceeded");
		
	}
	
}
