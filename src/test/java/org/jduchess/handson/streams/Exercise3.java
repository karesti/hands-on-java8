package org.jduchess.handson.streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

import org.jduchess.handson.Dish;
import org.junit.Test;

// Optional
public class Exercise3 extends TestBase {

	/**
	 * finds the value of a string create by Optional
	 */
	@Test
	public void should_find_out_value_from_Optional() {

		Optional<String> test = Optional.empty();

		// this variable has to be the value for the Optional to create
		String valueOfTest = "test";

		test = Optional.of(valueOfTest);

		assertThat(test.isPresent()).isTrue();

		assertThat(test.get()).isEqualTo("test");
	}

	/**
	 * Finds any of the vegetariens Dish
	 */
	@Test
	public void should_find_out_one_vegetarian_dishes() {
		Optional<Dish> anyVegetarianDish = Optional.empty();

		anyVegetarianDish = menu.stream().filter(Dish::isVegetarian).findAny();

		assertThat(anyVegetarianDish.isPresent()).isTrue();

		assertThat(anyVegetarianDish.get().isVegetarian()).isTrue();
	}

	/**
	 * Finds the first vegetarian Dish
	 */
	@Test
	public void should_find_out_first_vegetarian_dishes() {
		Optional<Dish> firstVegetarianDish = Optional.empty();

		firstVegetarianDish = menu.stream().filter(Dish::isVegetarian)
				.findFirst();

		assertThat(firstVegetarianDish.isPresent()).isTrue();

		assertThat(firstVegetarianDish.get().isVegetarian()).isTrue();
		assertThat(firstVegetarianDish.get().getName()).isEqualTo(
				"french fries");
	}

	/**
	 * Finds the maximum value of the calories of the Dishes using Optional
	 */
	/**
	 * Finds the maximum value of the calories of the Dishes using OptionalInt
	 */
	@Test
	public void should_find_out_min_calories_of_dishes() {
		OptionalInt valueMinCalories = OptionalInt.empty();

		valueMinCalories = menu.stream().mapToInt(Dish::getCalories).min();

		assertThat(valueMinCalories.isPresent()).isTrue();
		assertThat(valueMinCalories.getAsInt()).isEqualTo(120);

	}

	/**
	 * Finds the dish that has 950 calories
	 */
	@Test
	public void should_not_find_dishes_with_950_calories() {
		Optional<Dish> dishWith950Calories = Optional.empty();

		dishWith950Calories = menu.stream()
				.filter(dish -> dish.getCalories() == 950).findAny();

		assertThat(dishWith950Calories.isPresent()).isFalse();

		try {
			System.out.println(dishWith950Calories.get().getName());
		} catch (NoSuchElementException e) {
			// ce test doit lever une exception de type NoSuchElementException
			System.out.println("NoSuchElementException");
			assertThat(true);
		}

	}

}
