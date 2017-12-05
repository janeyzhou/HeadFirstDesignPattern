package factory.pattern.abstractfactory.source;

public class ThinCrustDough implements Dough {

	public String getDough() {
		return this.getClass().getName().toString();
		
	}

}
