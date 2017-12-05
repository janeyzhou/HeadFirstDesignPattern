package strategy.pattern.duck;

import strategy.pattern.flybehavior.FlyWithWings;
import strategy.pattern.quackbehavior.Chirp;

public class RedheadDuck extends Duck {
	protected void display () {
		System.out.println("Red Head");
	}
	
	//在子类的构造函数中实例化
	public RedheadDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Chirp();
	}
	


}