package strategy.pattern.duck;

import strategy.pattern.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args){
		//实例化的时候基础父类duck的实例变量（如： flyBehavior），并初始化flyBehavior为特定行为的新实例（如： flywithwings）
		Duck redheadduck = new RedheadDuck();
		redheadduck.performFly();
		redheadduck.performQuack();
		
		
		Duck rubberduck = new RubberDuck();
		rubberduck.performFly();//调用初始化函数中flyBehavior的初始化的实例
		rubberduck.setFlyBehavior(new FlyRocketPowered());//调用继承来的setter方法，设置flyBehavior的实例
		rubberduck.performFly();
	}
}
