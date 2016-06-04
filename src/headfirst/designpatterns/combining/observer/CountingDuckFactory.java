package headfirst.designpatterns.combining.observer;

/**
 * -Erb von AbstractDuckFactory
 * -Facotry Method
 * -ermöglicht das Quacken der einzelenen enten wird gezählt
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  
	/**
	 * @return QuackCounter		Ruf QuackCounter auf, welche eine MallardDuck instanziiert
	 */
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	/**
	 * * @return QuackCounter		Ruf QuackCounter auf, welche eine ReadHeadDuck instanziiert
	 */
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	/**
	 * * @return QuackCounter		Ruf QuackCounter auf, welche eine DuckCall instanziiert
	 */
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	/**
	 * * @return QuackCounter		Ruf QuackCounter auf, welche eine RubberDuckDuck instanziiert
	 */
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
