package headfirst.designpatterns.combining.observer;

/**
 * -Implementiert Observer
 * -Ist die einizge Observer-Klasse.
 * -Observer Pattern
 * -Enten werden zu Observable referenzeirt; Quackologist benachrigt mittels update()
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class Quackologist implements Observer {
 
	/**
	 * duck wird ausgegeben
	 */
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	/**
	 * gibt String aus
	 */
	public String toString() {
		return "Quackologist";
	}
}
