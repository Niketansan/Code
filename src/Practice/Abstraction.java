package Practice;
abstract class NikhilsRecipie{
	public String getRecipieName(String recipieName) {
		System.out.println();
	
		return recipieName;
	}
	public abstract String getSugarLevel();
	public abstract void prepareIcecream();
	
}
class Baskin extends NikhilsRecipie{
	
	String sugarLevel;
	int milkQuanty;
	int baskinFoodPowder;//gm
	String type;
	String recpName;
	Baskin(String  sugarLevel, int milkQuanty){
		this.sugarLevel = sugarLevel;
		this.milkQuanty=milkQuanty;
	}

	@Override
	public String getSugarLevel() {
		return sugarLevel;
	}
	
	public String  getRecipieName(String recipieName) {
	     recpName = recipieName;
		return recipieName;
	
	}
	@Override
	public void prepareIcecream() {
		if(sugarLevel.equals("HIGH")) {
			baskinFoodPowder = 1;	
		}
		System.out.println(printAllIngredients());
	}
	
	public String  printAllIngredients() {
		
		String allIng =  "For Given  Recepie "+recpName+" these are  Ingridents : Milk Quality is "+milkQuanty+"   Food powder is "+baskinFoodPowder +" Sugar level "+sugarLevel;
		return allIng;
		
	}
}
	

public class Demo{
	
}


public class Abstraction {
	
	public static void main(String[] args) {
		NikhilsRecipie  rec = new Baskin("HIGH", 1);
		rec.getRecipieName("BaskIn Vaneelia ICE cream");
		rec.prepareIcecream();
		
	} 
	
}
