package java8.comparator;

import java.util.Comparator;

import java8.dominio.Apple;

public class AppleComparator implements Comparator<Apple>{

	@Override
	public int compare(Apple a1, Apple a2) {

		return a1.getWeight().compareTo(a2.getWeight());
	}
	

}
