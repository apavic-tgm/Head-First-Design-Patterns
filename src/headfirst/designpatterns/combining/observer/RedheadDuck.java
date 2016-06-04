package headfirst.designpatterns.combining.observer;

/**
 * -Implementiert Quackable
 * -Factory Method
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class RedheadDuck implements Quackable {
	Observable observable;

	/**
	 * Erstellt neie Instanz von Ovservable
	 */
	public RedheadDuck() {
		observable = new Observable(this);
	}

	/**
	 * Quack wird ausgegen
	 * Observer wird benachrichtigt
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
	 * Readhead Duck wird ausgegeben
	 */
	public String toString() {
		return "Redhead Duck";
	}
}
