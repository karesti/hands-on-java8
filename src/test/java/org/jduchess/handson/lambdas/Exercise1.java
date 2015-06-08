package org.jduchess.handson.lambdas;

import org.jduchess.handson.Dish;
import org.jduchess.handson.TestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;


//Intermediate & terminal Operations
public class Exercise1 extends TestBase {

    @Test
    public void should_find_non_vegetarian_dishes() {
        // UPDATE the isNotVegetarian CODE to find all non vegetarian dishes
        Predicate<Dish> nonVegetarianDish = isNotVegetarian;
        List<Dish> nonVegetarianDishes = filter(menu, nonVegetarianDish);

        assertThat(nonVegetarianDishes).isNotEmpty();
        assertThat(nonVegetarianDishes).hasSize(5);

    }

    @Test
    public void should_find_non_vegetarian_dishes_using_lambda() {
        // REWRITE the nonVegetarianDish predicate using lambda expression
        Predicate<Dish> nonVegetarianDish = Predicate.isEqual(null);// (Dish dish) -> !dish.isVegetarian();
        List<Dish> nonVegetarianDishes = filter(menu, nonVegetarianDish);

        assertThat(nonVegetarianDishes).isNotEmpty();
        assertThat(nonVegetarianDishes).hasSize(5);

    }


    private <T> List<T> filter(List<T> listToFilter, Predicate<T> conditionToBeUsed) {
        List<T> results = new ArrayList<>();
        for (T objectToCheck : listToFilter) {
            if (conditionToBeUsed.test(objectToCheck)) {
                results.add(objectToCheck);
            }
        }
        return results;
    }

    private Predicate<Dish> isNotVegetarian = new Predicate<Dish>() {
        @Override
        public boolean test(Dish dish) {
            return false;//!dish.isVegetarian();
        }
    };

}
