package java8;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java8.collectors.PrimeNumbersCollector;
import java8.interfaces.ConsumerInterface;
import java8.interfaces.PredicateInterface;

public class Main {

	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("Salmon", false, 800, Dish.Type.FISH),
				new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER));

		Map<String, List<String>> dishTags = new HashMap<>();
		dishTags.put("pork", asList("greasy", "salty"));
		dishTags.put("beef", asList("salty", "roasted"));
		dishTags.put("chicken", asList("fried", "crisp"));
		dishTags.put("french fries", asList("greasy", "fried"));
		dishTags.put("rice", asList("light", "natural"));
		dishTags.put("season fruit", asList("fresh", "natural"));
		dishTags.put("pizza", asList("tasty", "salty"));
		dishTags.put("prawns", asList("tasty", "roasted"));
		dishTags.put("salmon", asList("delicious", "fresh"));
		
//		Map<Boolean, List<Dish>> isVeg = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
//		
//		System.out.println(isVeg);
//		
//		List<Dish> vegDishes = isVeg.get(true);
//		
//		System.out.println(vegDishes.get(0).getCalories());
//		
//		Map<Boolean, Map<Dish.Type, List<Dish>>> isVeg2 = menu.stream().collect(
//				Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));
//		
//		System.out.println(isVeg2);
//		
//		Map<Boolean, Dish> mostCaloric = menu.stream().collect(
//				Collectors.partitioningBy(Dish::isVegetarian, 
//						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))
//						,Optional::get)));
//		
//		System.out.println(mostCaloric);
//		
//		
//		Map<Boolean, Map<Boolean,List<Dish>>> mostCalori2 = menu.stream().collect(partitioningBy(Dish::isVegetarian,
//				partitioningBy(d -> d.getCalories()>500)));
//		
//		System.out.println(mostCalori2.get(true));
//				
//		Map<Boolean, Long> mostCalori3 = menu.stream().collect(partitioningBy(Dish::isVegetarian,
//				counting()));
//		
//		
//		System.out.println(mostCalori3);
		

//		menu.stream().collect(groupingBy(Dish::getName));
//
//		Map<Type, Set<String>> dishesByName = menu.stream().collect(groupingBy(Dish::getType,
//				Collectors.flatMapping(dish -> dishTags.get(dish.getName()).stream(), Collectors.toSet())));

		// System.out.println(dishesByName);
//
//		Map<Dish.Type, List<Integer>> dishesByType = menu.stream()
//				.collect(groupingBy(Dish::getType, Collectors.mapping(Dish::getCalories, Collectors.toList())));
//
//		System.out.println(dishesByType);
//		
//		Map<Dish.Type, Integer> dishesByTypeCt = menu.stream()
//				.collect(groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));
//
//		System.out.println(dishesByTypeCt);
		
	 enum CaloricLevel {
			DIET, NORMAL, FAT
		}
			 
	
//	Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType =
//			menu.stream().collect(
//			   groupingBy(Dish::getType, Collectors.mapping(dish -> {
//			          if (dish.getCalories() <= 400) return CaloricLevel.DIET;
//			          else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
//			          else return CaloricLevel.FAT; },
//			    Collectors.toSet() )));
//	
//	System.out.println(caloricLevelsByType);
		
		


//		Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevels = menu.stream()
//				.collect(groupingBy(Dish::getType, groupingBy(dish -> {
//					if (dish.getCalories() < 200)
//						return CaloricLevel.DIET;
//					else if (dish.getCalories() <= 300)
//						return CaloricLevel.NORMAL;
//					else
//						return CaloricLevel.FAT;
//				})));
//		
//		System.out.println(dishesByTypeCaloricLevels);

//		Map<Dish.Type, Long> dishesCount = menu.stream()
//				.collect(groupingBy(Dish::getType,Collectors.counting()));
//		System.out.println(dishesCount);

//		Map<Dish.Type, Dish> mostCaloricByCount = menu.stream().collect(groupingBy(Dish::getType,
//				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
//
//		System.out.println(mostCaloricByCount);
//List<Dish> menu2 = new ArrayList<>();

//	System.out.println(menu.stream().collect(maxBy(Comparator.comparing(Dish::getCalories))));
//	System.out.println(menu.stream().collect(averagingDouble(Dish::getCalories)));
//	System.out.println(menu.stream().collect(summarizingInt(Dish::getCalories)));
//	System.out.println(menu.stream().map(Dish::getName).collect(joining(", ")));
//	
//	int totalCalories =
//		    menu2.stream().map(Dish::getCalories).reduce(Integer::sum).orElse(0);
//	System.out.println(totalCalories);
//

//		
//
//		System.out.println(dishesByCalories);
////		
//		Trader raoul = new Trader("Raoul", "Cambridge");
//		Trader mario = new Trader("Mario","Milan");
//		Trader alan = new Trader("Alan","Cambridge");
//		Trader brian = new Trader("Brian","Cambridge");
////		
//		List<Transaction> transactions = Arrays.asList(
//		    new Transaction(brian, 2011, 300),
//		    new Transaction(raoul, 2012, 1000),
//		    new Transaction(raoul, 2011, 400),
//		    new Transaction(mario, 2012, 710),
//		    new Transaction(mario, 2012, 700),
//		    new Transaction(alan, 2012, 950)
//		);
//		
//		Map<Trader, List<Transaction>> l =   transactions.stream().collect(Collectors.groupingBy(Transaction::getTrader));
//		
//		System.out.println(l);
//	
////1. Find all transactions in the year 2011 and sort them by value (small to high).
//		
//		transactions.stream()
//		.filter(c -> c.getYear() == 2011)
//		.sorted(Comparator.comparing(Transaction::getValue))
//		.forEach(c -> 
//		System.out.println(c.getTrader() + " Year: " + c.getYear() + " Value: " + c.getValue()));
//		
//		System.out.println("=======================================");
////2. What are all the unique cities where the traders work?
//		transactions.stream()
//		.map(c -> c.getTrader().getCity())
//		.distinct()
//		.forEach(System.out::println);
//		
//		System.out.println("=======================================");
//		
//		
////3. Find all traders from Cambridge and sort them by name		
//		String traders = transactions.stream()		
//		.map(c -> c.getTrader().getName())
//		.distinct()		
//		.sorted()
//		.collect(Collectors.joining(","));
//		
//		System.out.println(traders);
//		
//		
//		System.out.println("=======================================");
//		
////4. Return a string of all traders’ names sorted alphabetically.
//		transactions.stream()		
//		.map(c -> c.getTrader())
//		.distinct()		
//		.sorted(Comparator.comparing(Trader::getName))
//		.forEach(c -> 
//		System.out.println("Trader: " + c.getName()));
//		
//		System.out.println("=======================================");
//
////5. Are any traders based in Milan?
//		
//		Boolean someInMilan =  transactions.stream()		
//		.map(c -> c.getTrader())
//		.distinct()		
//		.anyMatch(c -> c.getCity().equals("Milan"));
//		
//		if(someInMilan) {
//			System.out.println("There is at least one trader in Milan");
//		}
//		else {
//			System.out.println("No traders in Milan");
//		}
//		
//					
//		System.out.println("=======================================");
//	
////6.Print the values of all transactions from the traders living in Cambridge
//		
//		transactions.stream()						
//		.filter(c -> c.getTrader().getCity().equals("Cambridge"))				
//		.forEach(c -> 
//		System.out.println("Trader: " + c.getTrader() +  " City: " + c.getTrader().getCity() + " Transaction: " + c.getValue()));
//		
//		System.out.println("=======================================");
//		
////7. What’s the highest value of all the transactions?
//		
//		transactions.stream()
//		.map(Transaction::getValue)
//		.reduce(Integer::max)				
//		.ifPresent(c -> System.out.println("The highest value of all transactions is : "+ c));
//		
//		System.out.println("=======================================");
//
////8. Find the transaction with the smallest value.
//		
//		transactions.stream()		
//		.min(Comparator.comparing(Transaction::getValue))
//		.ifPresent(c -> System.out.println(c));
//				

		// .reduce(Integer::min)
		// .ifPresent(c -> System.out.println("The smallest value of all transactions is
		// : "+ c));

//		if(specialMenu.stream().allMatch(c -> c.getCalories() < 1000)) {
//			System.out.println("Todos pratos tem menos que 100 k");
//		}

//		List<Integer> lista1 = Arrays.asList(1,2,3);
//		List<Integer> lista2 = Arrays.asList(3,4);
//		//[[1,2,3], [3,4]]
//		//[1,2,3,3,4]
//		
//		
//			List<int[]> pairs= lista1.stream()
//				.flatMap(i -> lista2.stream().map(j -> new int[] {i,j}))
//				.filter(i -> (i[0] + i[1]) % 3 == 0)
//				.collect(Collectors.toList());
//			
//			
//			pairs.stream().forEach(a-> System.out.println(a[0]+","+a[1]));

//Stream.iterate(LocalDate.of(2023, 11, 14), n -> n.plusDays(1)).limit(100).forEach(System.out::println);

//Stream.iterate(new int[] {0,1}, n -> new int[] {n[1],n[0]+n[1]}).limit(20).forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));

////Stream.iterate(new int[] {0,1}, n-> new int[] {n[0]<100100} ,n -> new int[] {n[1],n[0]+n[1]}).limit(100).forEach(t -> System.out.println(t[0]));
//		IntStream.iterate(0, n -> n + 4)
//        .takeWhile(n -> n < 100)
//        .forEach(System.out::println);
//
//			

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

		// inventory.sort(new AppleComparator());

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

		// PrettyPrintApple.prettyPrintApple(apples, new PrintAppleColorStragery());
		// PrettyPrintApple.prettyPrintApple(apples, new PrintAppleWeightStragery());
		// PrettyPrintApple.prettyPrintApple(inventory, (Apple apple) ->
		// ColorEnum.RED.equals(apple.getColor()));
		// PrettyPrintApple.prettyPrintApple(inventory, (Apple apple) ->
		// apple.getWeight() > 10 && ColorEnum.RED.equals(apple.getColor()));
//		PrettyPrintApple.prettyPrintGeneric(inventory, (Apple apple) -> apple.getWeight() > 10 && ColorEnum.RED.equals(apple.getColor()));
//		PrettyPrintApple.prettyPrintGeneric(numbers, (Integer i) -> i % 2 == 0);
		// PrettyPrintApple.prettyPrintAppleSorted(inventory, (Apple apple) ->
		// apple.getWeight()>=10);

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
	 
//	 Map<Boolean, List<Integer>> prime = 
//			 
//			 IntStream.rangeClosed(2, 100).boxed().collect(partitioningBy(i -> isPrime(i), toList()));
//	 
//	 System.out.println(prime);
//	 
//Map<Boolean, List<Integer>> primeCustom = 
//			 
//			 IntStream.rangeClosed(2, 100).boxed().collect(new PrimeNumbersCollector());
//	 
//	 System.out.println(primeCustom);
	 
//	 Map<Boolean, Long> primect = 
//			 IntStream.rangeClosed(2, 100).boxed().collect(partitioningBy(i -> isPrime(i), counting()));
//	 
//	 System.out.println(primect);
//	 
//	 int howManyDishes = menu.stream().collect(collectingAndThen(toList(),List::size));
//	 System.out.println(howManyDishes);
//	 
//
	 
	 long fastest = Long.MAX_VALUE;
     for (int i = 0; i < 10; i++) {                                  
         long start = System.nanoTime();
         
         //IntStream.rangeClosed(2, 10000).boxed().collect(partitioningBy(ii -> isPrime(ii), toList()));
         IntStream.rangeClosed(2, 10000).boxed().collect(new PrimeNumbersCollector());
         long duration = (System.nanoTime() - start) / 1_000_000;    
         if (duration < fastest) fastest = duration;                 
     }
     System.out.println(
         "Fastest execution done in " + fastest + " msecs");
 }
	 
	 
	 
	 
	 
	
	
	
	public static boolean isPrime(int candidate) {
		return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
	}
	
	public static boolean isPrime2(List<Integer> primes, int candidate){
	    int candidateRoot = (int) Math.sqrt((double) candidate);
	    return primes
	                 .stream()
	                 .takeWhile( i-> i<=candidateRoot)
	                 .noneMatch(p -> candidate % p == 0);
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

	public static <T> List<T> filter(List<T> lista, PredicateInterface<T> p) {
		List<T> ls = new ArrayList<>();
		for (T t : lista) {
			if (p.test(t)) {
				ls.add(t);
				System.out.println(t);
			}

		}
		return ls;
	}
}