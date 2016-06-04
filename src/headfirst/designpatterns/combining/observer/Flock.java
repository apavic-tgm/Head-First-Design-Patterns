package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;


/**
 * -Implementiert Quackable
 * @author Antonio
 * @version 1.6.2016
 */
public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	/**
	 * @param duck		duck wird an die Liste geadded
	 */
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	/**
	 * Iterator geht alle elemente der Liste durch 
	 */
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	/**
	 * Iterator geht alle elemente der Liste durch 
	 */
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	/**
	 * NotifyObserver
	 */
	public void notifyObservers() { }
  
	/**
	 * String Flock of DUcks wird asugegeben
	 */
	public String toString() {
		return "Flock of Ducks";
	}
}
