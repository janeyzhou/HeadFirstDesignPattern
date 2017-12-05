package singleton.pattern.lazy;

public class TestCase {

	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		System.out.println(boiler.isBoiled());
		System.out.println(boiler.isEmpty());
		
	}

}
