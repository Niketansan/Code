package homeWork;
import java.util.*;

class UserInfo {
	
	//Variable Declaration
	String userName;
	String firstName;
	String lastName;
	String city;
	
	//Setters and Getters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//Conversion to string
	@Override
	public String toString() {

		return userName+""+firstName+""+lastName+""+city;
			
	}
}

public class ScannerHW {
	public static void main(String[] args) {
		
		Map<String, List<UserInfo>> map = new HashMap<>();

		List<UserInfo> list = new ArrayList<>();
		
		System.out.println("Number of Users to add:\n ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = n;
		while (i > 0) {
			System.out.println("Enter UserName: \n");
			String username = sc.next();
			System.out.println("Enter the First Name:\n");
			String firstName = sc.next();
			System.out.println("Enter the Last Name: \n");
			String lastName = sc.next();
			System.out.println("Enter the City: \n");
			String city = sc.next();
			
			UserInfo user = new UserInfo();

			user.setUserName(username);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setCity(city);
			list.add(user);
			
			i--;
		}

		System.out.println("Press Y - \t to display Users List \nPress N -\t to Exit");

		String input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			list.forEach(x -> {
				
				String UfirstCharacter = x.getUserName().substring(0, 1);
				
				if (map.containsKey(UfirstCharacter)) {
                      /// key found
					
					  //key related value 
					List updatedList = map.get(UfirstCharacter);
					updatedList.add(x);
					
					///put
					map.put(UfirstCharacter, updatedList);
					
				} else {
					List<UserInfo> newList = new ArrayList<>();
					newList.add(x);
					
					
                    ///put
					map.put(UfirstCharacter, newList);
				}

				System.out.println("User Name:"+x.getUserName()+"\nFirst Name:"+x.getFirstName()+"\nLast Name:"+x.getLastName()+"\nCity:"+x.getCity());
			});
		
		}

		else if (input.equalsIgnoreCase("N")) {

			System.out.println(" Thanks For Using our DataBase ");
		}
		System.out.println(map);
		
	}
}
