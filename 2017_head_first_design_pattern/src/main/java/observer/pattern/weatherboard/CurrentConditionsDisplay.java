package observer.pattern.weatherboard;

import observer.pattern.weather.Subject;

//需要实现Observer DisplayWeather 去获取update 并 display
public class CurrentConditionsDisplay implements Observer, DisplayWeather  {
	private Subject weatherData;
	private float temperature;
	private float humidity;
	
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	//需要实现Observer的方法
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	//需要实现DisplayWeather的方法
	public void display() {
		System.out.println("Current Conditions: " + this.temperature + "; "+ this.humidity);
	}


}
