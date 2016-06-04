package headfirst.designpatterns.combining.observer;


/**
 * -Implementiert Quackable
 * -FactoryMethod
 * -Enthält Attribute und methoden von Quackable
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class RubberDuck implements Quackable {
	Observable observable;

	/**
	 * Erstellt Instanz von Observabel
	 */
	public RubberDuck() {
		observable = new Observable(this);
	}
 
	/**
	 * Squeak wird ausgegebn
	 * Benachrichtigt Observers
	 */
	public void quack() {
		System.out.println("Squeak");
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
		return "Rubber Duck";
	}
}
