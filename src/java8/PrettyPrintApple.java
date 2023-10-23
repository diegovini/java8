package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PrettyPrintApple {
	
	public static void prettyPrintApple(List<Apple>inventory, Predicate<Apple> p) {
		for (Apple apple : inventory) {
			if(p.test(apple)) {
				System.out.println(apple.getColor() + " " + apple.getWeight());				
			}
		}
	}
	
	public static void prettyPrintAppleSorted(List<Apple>inventory, Predicate<Apple> p) {
		inventory.sort((Apple apple, Apple apple2) -> Integer.valueOf(apple2.getWeight()).compareTo(apple.getWeight())); 
		for (Apple apple : inventory) {
			if(p.test(apple)) {
				System.out.println(apple.getColor() + " " + apple.getWeight());				
			}
		}
	}
	
	public static <T> List<T> prettyPrintGeneric(List<T>inventory, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : inventory) {
			if(p.test(e)) {
				result.add(e);
				System.out.println(e);
			}
		}
		return result;
	}
	
	public static void process(Runnable r) {
		r.run();
	}

}
