package strategy.pattern.duck;

import strategy.pattern.flybehavior.FlyBehavior;
import strategy.pattern.quackbehavior.QuackBehavior;

public abstract class Duck {
	//抽取出可变的部分，用专门的一组类来实现可变部分，而不是由子类去实现可变部分，针对接口编程，而不是实现编程，让实例的这些可变行为可以动态的改变
		/*	protected void fly() {
			System.out.println("Duck Fly");
		} 
		protected void quack() {
			System.out.println("quack");
		}*/

	//在父类中加入行为的两个实例变量，声明为接口类型，每个变量在运行的时候利用多态来引用正确的行为（如： flywithwings, flynowings）
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	

	public Duck() {
		
	}
	
	public void performFly(){
		flyBehavior.fly();//委托给行为类处理fly
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	protected void swim() {
		System.out.println("all duck, swim");
	}
	
	protected void display(){
		System.out.println("Head color");
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	
	
}


