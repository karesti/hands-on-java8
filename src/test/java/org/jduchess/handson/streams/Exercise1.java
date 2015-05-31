package org.jduchess.handson.streams;

import org.jduchess.handson.Dish;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;


//Intermediate & terminal Operations
public class Exercise1 extends TestBase {

    //filter
    @Test
    public void should_find_out_all_vegetarian_dishes(){
        List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian).collect(toList());

        assertThat(vegetarianDishes).isNotEmpty();
        assertThat(vegetarianDishes).hasSize(4);

    }

    //map
    @Test
    public void should_collect_all_dishes_name(){
        List<String> names = menu.stream().map(Dish::getName).collect(toList());

        assertThat(names).isNotEmpty();
        assertThat(names).hasSize(menu.size());

    }

    //distinct
    @Test
    public void should_find_out_distinct_types_of_dishes(){
        long count = menu.stream().map(Dish::getType).distinct().count();

        assertThat(count).isEqualTo(3);

    }

    //limit
    //How would you use streams to filter the first two meat dishes?
    @Test
    public void should_get_the_any_fish_dish(){

        Optional<Dish> anyFishDish = menu.stream().filter(d -> Dish.Type.FISH.equals(d.getType())).findAny();

        assertThat(anyFishDish.isPresent()).isTrue();
        assertThat(anyFishDish.get().getType()).isEqualTo(Dish.Type.FISH);


    }

    //map
    // to find out the length of the name of each dish
    @Test
    public void should_find_out_legth_of_the_name_of_each_dish(){
        List<Integer> dishNameLengths = menu.stream() .map(Dish::getName)
                .map(String::length)
                .collect(toList());

    }

    //flatmap?? pags 125

    //Filtering a menu using a stream to find out three high-calorie dish names -
    @Test
    public void should_find_out_three_high_calorie_dish_names(){
        List<String> highCalorieDishes = menu.stream().filter(d -> d.getCalories() > 300)
                                .map(Dish::getName)
                                .limit(3)
                                .collect(toList());

        assertThat(highCalorieDishes).isNotEmpty();
        assertThat(highCalorieDishes).hasSize(3);
    }

    //reduce
    @Test
    public void should_count_number_of_dishes_using_reduce(){
        int count = menu.stream() .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        assertThat(count).isEqualTo(9);
    }

    //reduce
    @Test
    public void should_count_number_of_calories_in_menu(){
        int calories = menu.stream() .map(Dish::getCalories)
                .reduce(0, Integer::sum);

        assertThat(calories).isEqualTo(4200);
    }



}
