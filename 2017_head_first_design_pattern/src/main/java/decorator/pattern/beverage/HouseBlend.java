package decorator.pattern.beverage;

import decorator.pattern.startbuzz.Beverage;

public class HouseBlend extends Beverage{
	
	public HouseBlend(){
		description = "House Blend";
	}

	@Override
	public double cost() {
		return 3;
	}
	

}
