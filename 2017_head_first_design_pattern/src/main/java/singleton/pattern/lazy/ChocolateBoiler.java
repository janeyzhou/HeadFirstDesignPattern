package singleton.pattern.lazy;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}

	private static ChocolateBoiler uniqueChocolateBoiler;
	
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance(){
		if(uniqueChocolateBoiler == null){
			uniqueChocolateBoiler = new ChocolateBoiler();
		}
		return uniqueChocolateBoiler;
	}


}
