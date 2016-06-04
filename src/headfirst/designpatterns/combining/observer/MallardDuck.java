package headfirst.designpatterns.combining.observer;


/**
 * -Implements Quackable
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class MallardDuck implements Quackable {
	Observable observable;
 
	/**
	 * Erstellt Instanz von Observabel
	 */
	public MallardDuck() {
		observable = new Observable(this);
	}
 
	/**
	 * Quack wird ausgegebn
	 * Benachrichtigt Observers
	 */
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
 
	/**
	 * RegisterObserver wird aufgerufen
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
 
	/**
	 * NottifyObservers wird aufgerufen
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	/**
	 * Mallard Duck wird ausgegeben
	 */
	public String toString() {
		return "Mallard Duck";
	}
}
