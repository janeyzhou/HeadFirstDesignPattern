package factory.pattern.abstractfactory.pizza;

import factory.pattern.abstractfactory.source.Cheese;
import factory.pattern.abstractfactory.source.Dough;

public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("bake for 30 minutes");
	}
	
	
	public String getName(){
		return name;
	}
	
	

}
