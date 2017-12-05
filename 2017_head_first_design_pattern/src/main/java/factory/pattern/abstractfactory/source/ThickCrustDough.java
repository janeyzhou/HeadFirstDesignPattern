package factory.pattern.abstractfactory.source;

public class ThickCrustDough implements Dough {

	public String getDough() {
		return this.getClass().getName().toString();
		
	}

}
