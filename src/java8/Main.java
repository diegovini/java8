package java8;

import java.util.Arrays;
import java.util.List;

import java8.enums.ColorEnum;

public class Main {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.setColor(ColorEnum.BLUE);
		a2.setColor(ColorEnum.RED);
		a3.setColor(ColorEnum.GREEN);
		
		a1.setWeight(10);
		a2.setWeight(20);
		a3.setWeight(30);
		
		List<Apple> inventory = Arrays.asList(a1,a2,a3);
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		//PrettyPrintApple.prettyPrintApple(apples, new PrintAppleColorStragery());
		//PrettyPrintApple.prettyPrintApple(apples, new PrintAppleWeightStragery());
		//PrettyPrintApple.prettyPrintApple(inventory, (Apple apple) -> ColorEnum.RED.equals(apple.getColor()));
		//PrettyPrintApple.prettyPrintApple(inventory, (Apple apple) -> apple.getWeight() > 10 && ColorEnum.RED.equals(apple.getColor()));
//		PrettyPrintApple.prettyPrintGeneric(inventory, (Apple apple) -> apple.getWeight() > 10 && ColorEnum.RED.equals(apple.getColor()));
//		PrettyPrintApple.prettyPrintGeneric(numbers, (Integer i) -> i % 2 == 0);
		//PrettyPrintApple.prettyPrintAppleSorted(inventory, (Apple apple) -> apple.getWeight()>=10);

		Runnable r1 = () -> System.out.println("Hello world 1");
		PrettyPrintApple.process(r1);
		
		PrettyPrintApple.process(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello world 2");
				
			}
		});
		
		PrettyPrintApple.process(() -> System.out.println("Hello world 3"));

		
		
		

	}
}