package headfirst.designpatterns.combining.observer;


/**
 * -Implements Quackable
 * -Adapter Pattern
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class DecoyDuck implements Quackable {
	Observable observable;

	/**
	 * Erstellt Instanz von Observabel
	 */
	public DecoyDuck() {
		observable = new Observable(this);
	}
 
	/**
	 * Silence wird ausgegebn
	 * Benachrichtigt Observers
	 */
	public void quack() {
		System.out.println("<< Silence >>");
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
	 * Rubber Duck wird ausgegeben
	 */
	public String toString() {
		return "Decoy Duck";
	}
}
