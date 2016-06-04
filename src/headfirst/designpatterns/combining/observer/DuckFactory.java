package headfirst.designpatterns.combining.observer;


/**
 * -Erbst von Abstracten Klasse
 * -Factory Method
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class DuckFactory extends AbstractDuckFactory {
  
	/**
	 * @return MallardDuck		Neue MallardDuck wird instaziiert
	 */
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	/**
	 * @return ReadheadDuck		Neue RedheadDuck wird instaziiert
	 */
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	/**
	 * @return DuckCall		Neue DuckCall wird instaziiert
	 */
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	/**
	 * @ return RubberDuck		Neue RubberDuck wird instaziiert
	 */
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
