package headfirst.designpatterns.combining.observer;

/**
 * -Adapter Pattern
 * -Gans kann honken und gibt Goose zurück
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class Goose {

	/**
	 * Honkt in der Konsole
	 */
	public void honk() {
		System.out.println("Honk");
	}

	/**
	 * liefert String zurück
	 */
	public String toString() {
		return "Goose";
	}
}
