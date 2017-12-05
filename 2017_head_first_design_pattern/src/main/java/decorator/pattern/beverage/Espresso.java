package decorator.pattern.beverage;

import decorator.pattern.startbuzz.Beverage;

public class Espresso extends Beverage{
	
	public Espresso(){
		description = "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2;
	}

}
