package java8.strategies;

import java8.dominio.Apple;
import java8.interfaces.ApplePredicate;

public class PrintAppleWeightStragery implements ApplePredicate{

	@Override
	public String print(Apple apple) {		
		return "Printing Weight:" +  apple.getWeight();
	}

}
