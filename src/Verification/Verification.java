package Verification;

public class Verification {

	//age
		private boolean eligibleForVotingOrNot(int age){
			if(age>=18)
				return true;
			else
				return false;
		}
		//name
		private String getFullName(String full_Name){
			
			return full_Name;
		}
		//aadharId
		private boolean aadharLength(String aadhar_id) {
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
		private boolean verifyMobile(String mobile_number) {
			int len=mobile_number.length();
			if (len==10)
				return true;
			else
				return false;
		}
		//address
		private boolean verifyAddress(String address) {
			if (address.length()<=100)
				return true;
			else
				return false;
			
		}
		
		
		
		public  Sting  verify()Details details) {
			String statsu ="":
			
			if.eqauls(ApplocationConstat.addharcreationType)) {
				bolean test   = (details.getAadhar_id());
					
				booolean  mobileNUmberNUckec =  verifyMobile(details.getMobile_number());
				
				
				if(tes&&&  mobileNUmber  check )
				{
					status   ="Your adharcard created succesfu"
				}else {
					status  =" Failure"
				}
				
				
			}else  if(type  ==  ) {
				
			}else {
				
				stauts   " PLeasesend vaild  ceaion Type ";
			}
			
		}

}
