package headfirst.designpatterns.combining.observer;

/**
 * -Implements Quackable
 * -Factory Pattern
 * -Enthält Attribute und methoden von Quackable
 * @author Antonio Pavic
 *
 */
public class DuckCall implements Quackable {
	Observable observable;

	/**
	 * Erstellt Instanz von Observabel
	 */
	public DuckCall() {
		observable = new Observable(this);
	}
 
	/**
	 * Kwak wird ausgegebn
	 * Benachrichtigt Observers
	 */
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	/**
	 * RegisterObserver wird aufgerufen
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	/**
	 * NotifyObservers wird aufgerufen
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	/**
	 * Duck Call wird ausgegeben
	 */
	public String toString() {
		return "Duck Call";
	}
}
