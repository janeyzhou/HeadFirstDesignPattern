package strategy.pattern.duck;

import strategy.pattern.flybehavior.FlyNoWings;
import strategy.pattern.quackbehavior.Mute;

public class RubberDuck extends Duck {
	public RubberDuck(){
		flyBehavior = new FlyNoWings();
		quackBehavior = new Mute();
	}


}
