package java8.strategies;

import java8.dominio.Apple;
import java8.interfaces.ApplePredicate;

public class PrintAppleColorStragery implements ApplePredicate{

	@Override
	public String print(Apple apple) {		
		return "Printing color:" +  apple.getColor();
	}

}
