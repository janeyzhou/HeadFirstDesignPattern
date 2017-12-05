package decorator.pattern.startbuzz;

import decorator.pattern.beverage.Espresso;
import decorator.pattern.beverage.HouseBlend;
import decorator.pattern.condiment.Mocha;
import decorator.pattern.condiment.Whip;

public class TestCase {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $: " + espresso.cost()); 
		
		Beverage doubleMochaWhipHouseBlend = new HouseBlend();
		doubleMochaWhipHouseBlend = new Mocha(doubleMochaWhipHouseBlend);
		doubleMochaWhipHouseBlend = new Mocha(doubleMochaWhipHouseBlend);
		doubleMochaWhipHouseBlend = new Whip(doubleMochaWhipHouseBlend);
		System.out.println(doubleMochaWhipHouseBlend.getDescription() + " $: " + doubleMochaWhipHouseBlend.cost());
		

	}

}
