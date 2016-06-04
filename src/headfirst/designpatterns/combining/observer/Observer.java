package headfirst.designpatterns.combining.observer;

/**
 * Observer - Interface
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public interface Observer {
	
	/** 
	 * @param duck		Quackobservable wird mit Typ duck definiert		
	 */
	public void update(QuackObservable duck);
}
