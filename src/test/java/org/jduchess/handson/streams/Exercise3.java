package org.jduchess.handson.streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

import org.jduchess.handson.Dish;
import org.jduchess.handson.TestBase;
import org.junit.Test;

// Optional
public class Exercise3 extends TestBase {

	/**
	 * finds the value of a string create by Optional
	 */
	@Test
	public void should_find_out_value_from_Optional() {

		Optional<String> test = null;
		
		// ADD CODE HERE TO SET THE DEFAULT VALUE <a> Empty </a> OF THE OPTIONAL 

		// this variable has to be the value for the Optional to create
		String valueOfTest = "test";

		// ADD CODE HERE TO SET THE VALUE OF THE VARIABLE test FROM THE String <a>valueOfTest</a>
		

		assertThat(test.isPresent()).isTrue();

		assertThat(test.get()).isEqualTo("test");
	}

	/**
	 * Finds any of the vegetariens Dish
	 */
	@Test
	public void should_find_out_one_vegetarian_dishes() {
		Optional<Dish> anyVegetarianDish = null;
		
		// ADD CODE HERE TO SET THE DEFAULT VALUE <a> Empty </a> OF THE OPTIONAL

		// ADD CODE HERE TO GET ANY OF THE VEGETERIAN DISHES

		assertThat(anyVegetarianDish.isPresent()).isTrue();

		assertThat(anyVegetarianDish.get().isVegetarian()).isTrue();
	}

	/**
	 * Finds the first vegetarian Dish
	 */
	@Test
	public void should_find_out_first_vegetarian_dishes() {
		Optional<Dish> firstVegetarianDish = null;
		
		// ADD CODE HERE TO SET THE DEFAULT VALUE <a> Empty </a> OF THE OPTIONAL

		// ADD CODE HERE TO FIND OUT THE FIRST VEGETARIAN

		
		assertThat(firstVegetarianDish.isPresent()).isTrue();
		assertThat(firstVegetarianDish.get().isVegetarian()).isTrue();
		assertThat(firstVegetarianDish.get().getName()).isEqualTo(
				"french fries");
	}

	/**
	 * Finds the maximum value of the calories of the Dishes using OptionalInt
	 */
	@Test
	public void should_find_out_min_calories_of_dishes() {
		OptionalInt valueMinCalories = null;
		
		// ADD CODE HERE TO SET THE DEFAULT VALUE <a> Empty </a> OF THE OPTIONAL

		// ADD CODE HERE TO FIND OUT THE MAX OF CALORIES

		assertThat(valueMinCalories.isPresent()).isTrue();
		assertThat(valueMinCalories.getAsInt()).isEqualTo(120);
	}

	/**
	 * Finds the dish that has 950 calories
	 */
	@Test
	public void should_not_find_dishes_with_950_calories() {
		Optional<Dish> dishWith950Calories = null;
		
		// ADD CODE HERE TO SET THE DEFAULT VALUE <a> Empty </a> OF THE OPTIONAL

		// ADD CODE HERE TO FIND OUT THE DISH WITH 950 CALORIES

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
