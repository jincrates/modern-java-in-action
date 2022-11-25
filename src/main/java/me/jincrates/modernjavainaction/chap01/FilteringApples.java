package me.jincrates.modernjavainaction.chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class FilteringApples {

	public static void main(String... args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, "green"),
			new Apple(155, "green"),
			new Apple(120, "red")
		);

		List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
		System.out.println(greenApples);
		
		List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
		System.out.println(heavyApples);

		List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
		System.out.println(greenApples2);

		List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		System.out.println(heavyApples2);
		
		List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
		System.out.println(weirdApples);
	}

	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
}