package headfirst.designpatterns.combining.observer;


/**
 * -Implementiert Quackable
 * -Decorator Pattern
 * -numberOfQuacks wir von QuackCounter hochgezählt
 * -spezifische ente durch nummer bekommen
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	
	/**
	 * @param duck		Konstruktor
	 */
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	/**
	 * Quack wird aufgerufen und numberOfQuacks wird erhöht
	 */
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	/**
	 * @return numerOfQuacks numberOfQuacks wird zurückgegeben
	 */
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	/**
	 * @param observer		registerObserver mit Parameter observer wird aufgerufen
	 */
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 
	/**
	 * Benachrichtigung observer
	 */
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
	/**
	 * String wird zurückgegeben 
	 */
	public String toString() {
		return duck.toString();
	}
}
