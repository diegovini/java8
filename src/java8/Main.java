package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import java8.dominio.Apple;
import java8.dominio.Letter;
import java8.enums.ColorEnum;
import java8.interfaces.ConsumerInterface;
import java8.interfaces.FunctionInterface;
import java8.interfaces.PredicateInterface;

public class Main {	


	public static void main(String[] args) {
		
		
		
		List<Dish> menu = Arrays.asList(
			    new Dish("pork", false, 800, Dish.Type.MEAT),
			    new Dish("beef", false, 700, Dish.Type.MEAT),
			    new Dish("chicken", false, 400, Dish.Type.MEAT),
			    new Dish("french fries", true, 530, Dish.Type.OTHER),
			    new Dish("rice", true, 350, Dish.Type.OTHER),
			    new Dish("season fruit", true, 120, Dish.Type.OTHER),
			    new Dish("pizza", true, 550, Dish.Type.OTHER),
			    new Dish("prawns", false, 300, Dish.Type.FISH),
			    new Dish("salmon", false, 450, Dish.Type.FISH) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
//		a1.setColor(ColorEnum.BLUE);
//		a2.setColor(ColorEnum.RED);
//		a3.setColor(ColorEnum.GREEN);
//		
//		a1.setWeight(40);
//		a2.setWeight(40);
//		a3.setWeight(80);
//		
//		List<Apple> inventory = Arrays.asList(a2,a3,a1);
//		
//		String text = Letter.addHeader("Olá, seja bem vindo ao ladba");		
//		text = Letter.addFooter(text);
//		text = Letter.checkSpelling(text);
//		System.out.println(text);
//		
//		
//		Function<String,String> addHeader = Letter::addHeader;
//		Function<String,String> transformationPipeline = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
//		Function<String,String> transformationPipeline2 = addHeader.andThen(Letter::checkSpelling);
//		
//		
//		String a = transformationPipeline.apply("Olá, seja bem vindo ao ladba");
//		System.out.println(a);
//		
//		String aa1 = transformationPipeline2.apply("Olá, seja bem vindo ao ladba");
//		System.out.println(aa1);
		
		
		
		
		
		//inventory.sort(new AppleComparator());
		
//		inventory.sort(new Comparator<Apple>() {
//
//			@Override
//			public int compare(Apple o1, Apple o2) {
//				// TODO Auto-generated method stub
//				return o1.getWeight().compareTo(o2.getWeight());
//			}
//		});
		
//		inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
//		
//		for (Apple apple : inventory) {
//			System.out.println("Apple sorted by weight: "+ apple.getWeight() + " " + apple.getColor());
//		}
		
//		Predicate<Apple> notRed = (Apple aa) -> ColorEnum.BLUE.equals(aa.getColor());
//		System.out.println(notRed.negate().or((Apple ax) -> ax.getWeight()>80).test(a1));
		
//		Function<Integer, Integer> f = x -> x + 1;
//		Function<Integer, Integer> g = x -> x * 2;
//		Function<Integer, Integer> h = f.andThen(g);
//		
//		System.out.println(h.apply(10));
		
//		List<Apple> inventory = Arrays.asList(a1,a2,a3);
//		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		//PrettyPrintApple.prettyPrintApple(apples, new PrintAppleColorStragery());
		//PrettyPrintApple.prettyPrintApple(apples, new PrintAppleWeightStragery());
		//PrettyPrintApple.prettyPrintApple(inventory, (Apple apple) -> ColorEnum.RED.equals(apple.getColor()));
		//PrettyPrintApple.prettyPrintApple(inventory, (Apple apple) -> apple.getWeight() > 10 && ColorEnum.RED.equals(apple.getColor()));
//		PrettyPrintApple.prettyPrintGeneric(inventory, (Apple apple) -> apple.getWeight() > 10 && ColorEnum.RED.equals(apple.getColor()));
//		PrettyPrintApple.prettyPrintGeneric(numbers, (Integer i) -> i % 2 == 0);
		//PrettyPrintApple.prettyPrintAppleSorted(inventory, (Apple apple) -> apple.getWeight()>=10);

//		Runnable r1 = () -> System.out.println("Hello world 1");
//		PrettyPrintApple.process(r1);
//		Function d = new Function<T, R>() {
//		};
//		
//		PrettyPrintApple.process(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Hello world 2");
//				
//			}
//		});
//		
//		PrettyPrintApple.process(() -> System.out.println("Hello world 3"));
//		List<String> strings = List.of("", "1233", "1234554353" ,"3123123", "dsfdsf");
//		
//		PredicateInterface<String> p = (String s) -> s.isEmpty();
//		PredicateInterface<String> p2 = (String s) -> s.length()>5;
//				
//		
//		
//		List<Integer> weights= Arrays.asList(1,2,4,7);
//		
//		List<Apple> apples = map(weights, Apple::new);
//		
//		for (Apple apple : apples) {
//			System.out.println(apple.getColor());
//			System.out.println(apple.getWeight());
//		}
		
		
		
				
		
		 
		
	}
	
	private static List<Apple> map(List<Integer> weights, FunctionInterface<Integer, Apple> f) {
		List<Apple> results = new ArrayList<>();
		for (Integer i: weights) {
			results.add(f.apply(i));
			
		}
		return results;
	}

	public static boolean isValid(String s) {
		return Character.isUpperCase(s.charAt(0));
		}
	


	
//	public static <T,R> List<R> map(List<T> lis, Function<T,R> f) {
//		List<R> listaNova = new ArrayList<>();
//		for (T t : lis) {
//			listaNova.add(f.apply(t));
//		}
//		System.out.println(listaNova);
//		return listaNova;
//		
//	}

	public static <T> void forEach(List<T> listaa, ConsumerInterface<T> c) {
		for (T t : listaa) {
			c.consume(t);
		}
	}
	
	
	public static <T> List<T> filter(List<T> lista, PredicateInterface<T> p){
		List<T> ls = new ArrayList<>();
		for (T t : lista) {
			if(p.test(t)) {
				ls.add(t);
				System.out.println(t);
			}
			
		}
		return ls;
	}
}