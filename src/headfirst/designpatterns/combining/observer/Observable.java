package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;


/**
 * -Implementiert QuackObserable
 * -Observer Pattern
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	/**
	 * @param duck		Konstruktor
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	/**
	 * @param observer		Elemente werden in eine Liste eingefügt
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	/**
	 * Interator geht alle Elemente durch
	 */
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	/**
	 * @return	observers.iterator		
	 */
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
