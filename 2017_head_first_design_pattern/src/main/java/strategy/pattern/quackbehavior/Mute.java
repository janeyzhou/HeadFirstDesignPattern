package strategy.pattern.quackbehavior;

public class Mute implements QuackBehavior{

	public void quack() {
		System.out.println("Quite");
	}

}
