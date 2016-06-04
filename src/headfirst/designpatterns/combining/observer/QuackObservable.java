package headfirst.designpatterns.combining.observer;


/**
 * Interface QuackObservablr
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public interface QuackObservable {
	
	/**
	 * Parameter mit Typ Observer
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Benachrichtigt Observer
	 */
	public void notifyObservers();
}
