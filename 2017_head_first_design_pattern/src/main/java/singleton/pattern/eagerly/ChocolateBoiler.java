package singleton.pattern.eagerly;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	
	private ChocolateBoiler(){
		
	}
	
	public static ChocolateBoiler getInstance(){
		return uniqueInstance;
	}
	
	

}
