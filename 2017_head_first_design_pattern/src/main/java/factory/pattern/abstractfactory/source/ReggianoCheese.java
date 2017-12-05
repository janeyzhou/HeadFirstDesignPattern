package factory.pattern.abstractfactory.source;

public class ReggianoCheese implements Cheese {

	public String getCheese() {
		return this.getClass().getName().toString();
		
	}

}
