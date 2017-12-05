package observer.pattern.weather;

import java.util.ArrayList;

import observer.pattern.weatherboard.Observer;

public class WeatherData implements Subject{
	private ArrayList<Observer> observersList;//记录所有的观察者
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observersList = new ArrayList<Observer>();
	}
	
	//需要实现subject的抽象方法
	public void registerObserver(Observer observer) {
		observersList.add(observer);
		
	}
	//需要实现subject的抽象方法
	public void removeObserver(Observer observer) {
		int observerIndex = observersList.indexOf(observer);
		if(observerIndex >= 0){
			observersList.remove(observerIndex);
		}
	}
	//需要实现subject的抽象方法
	public void notifyObserver() {
		for(int observerIndex = 0; observerIndex < observersList.size(); observerIndex++){//通知所有的观察者
			Observer observer = observersList.get(observerIndex);
			observer.update(temperature, humidity, pressure);  //观察者必须实现Observer中的update方法
		}
		
	}
	
	//客户方提供的检测变化的接口
	public void measurementsChanged(){
		notifyObserver(); //一旦有变化调用notifObserver方法
	}
	

}
