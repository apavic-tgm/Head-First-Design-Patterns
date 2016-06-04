package headfirst.designpatterns.combining.observer;


/**
 * -Abstracte Klasse
 * -FactoryPattern
 * @author Antonio Pavic
 * @version 1.6.2016
 */
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
