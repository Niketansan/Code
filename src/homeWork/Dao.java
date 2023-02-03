package homeWork;
// Dao Using Collection Framework - List
import java.util.List;
import java.util.ArrayList;
interface UserDao{
	public String createUser();
	public String getUser();
	public String saveUser();
	public String updateUser();
	public String deleteUser();
	
}

class UserDaoImpl implements UserDao{

	public String createUser() {
		return "New User is Created";
	}
	public String getUser() {
		return "User Data Recieved";
	}
	public String saveUser() {
		return "User Data Saved";
	}
	public String updateUser() {
		return "User Data Updated";
	}
	public String deleteUser() {
		return "User Data Deleted";
	}
	
}
	
public class Dao {

	public static void main(String[] args) {
		List DaoList = new ArrayList();
		UserDao DaoUser01 = new UserDaoImpl();
		
		DaoList.add(DaoUser01);
		DaoList.add(DaoUser01.createUser());
		DaoList.add(DaoUser01.getUser());
		DaoList.add(DaoUser01.saveUser());
		DaoList.add(DaoUser01.updateUser());
		DaoList.add(DaoUser01.deleteUser());
		System.out.println(DaoList);
		DaoList.remove(0);
		System.out.println(DaoList);
		for (Object D : DaoList) {
			System.out.println(D);
		}
	}

}
