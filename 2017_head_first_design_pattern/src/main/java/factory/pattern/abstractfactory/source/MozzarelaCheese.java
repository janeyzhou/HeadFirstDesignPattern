package factory.pattern.abstractfactory.source;

public class MozzarelaCheese implements Cheese{

	public String getCheese() {
		return this.getClass().getName().toString();
	}

}
