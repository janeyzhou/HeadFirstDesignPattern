package factory.pattern.factorymethod.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	
	public void prepare(){
		System.out.println("Prepare pizza: "+ name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sause...");
		System.out.println("Adding toppings: ");
		for(int i = 0; i < toppings.size(); i++){
			System.out.println("   "+toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("baking 30 minutes");
	}
	
	public void cut(){
		System.out.println("cuting pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("boxing with offical pizzal box");
	}
	
	public String getName(){
		return name;
	}

}
