package java8.strategies;

import java8.dominio.Apple;
import java8.interfaces.ApplePredicate;

public class PrintIsAppleHeavy implements ApplePredicate{

	@Override
	public String print(Apple apple) {
		return (apple.getWeight() > 15 ? "This apple is light" + apple.getWeight() 
		:  "This apple is heavy " + apple.getWeight()); 
		
		
	}

}
