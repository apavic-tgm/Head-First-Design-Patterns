package headfirst.designpatterns.combining.observer;


/**
 * -Implementiert Quackable
 * -Adapter Pattern
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	/**
	 * @param goose		Konstruktor/Observable bekommt eine neue Instanz
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
	/**
	 * Honk wird aufgerufen
	 * Benachrichtigung des Observers
	 */
	public void quack() {
		goose.honk();
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
		return "Goose pretending to be a Duck";
	}
}
