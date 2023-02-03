package Verification;

public class Aadhar extends Verification{
	String full_Name,address;
	String aadhar_id,mobile_number;
	int age ;
	
	
	public static void main(String[] args) 
	{
		Aadhar a = new Aadhar();
		a.aadhar_id="767914583950";
		a.age=18;
		a.mobile_number="6281601214";
		a.full_Name="Valluri Nikhil Sanjay";
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
		String fullName = a.getFullName(a.full_Name);
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
