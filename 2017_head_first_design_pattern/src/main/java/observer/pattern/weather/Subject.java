package observer.pattern.weather;

import observer.pattern.weatherboard.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
	
}
