import java.util.HashMap;
import java.util.Map;

public class person {
	
	private String name;
	private Map<String, String> diet;
	
	public person(String name) {
		
		this.name = name;
		diet = new HashMap<String, String>();
		
	}
	
	public void addDiet(String food){
			diet.put(this.name, food);
	}
	
	public String getDiet(){
		return this.name + "'s" + " diet is: " + diet.get(this.name);
	}
}
