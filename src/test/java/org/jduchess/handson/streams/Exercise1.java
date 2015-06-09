package org.jduchess.handson.streams;

import org.assertj.core.util.Lists;
import org.jduchess.handson.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
    public void should_collect_all_dishes_names(){
        List<String> names = menu.stream().map(Dish::getName).collect(toList());

        assertThat(names).isNotEmpty();
        assertThat(names).hasSize(menu.size());

    }

    //distinct
    @Test
    public void should_find_out_how_many_distinct_types_of_dishes(){
        long count = menu.stream().map(Dish::getType).distinct().count();

        assertThat(count).isEqualTo(3);

    }

    //limit
    //How would you use streams to filter the first two meat dishes?
    @Test
    public void should_get_any_fish_dish(){

        Optional<Dish> anyFishDish = menu.stream().filter(d -> Dish.Type.FISH.equals(d.getType())).findAny();

        assertThat(anyFishDish.isPresent()).isTrue();
        assertThat(anyFishDish.get().getType()).isEqualTo(Dish.Type.FISH);


    }

    //map
    // to find out the length of the name of each dish
    @Test
    public void should_build_a_stream_from_the_legth_of_the_name_of_each_dish(){
        List<Integer> dishNameLengths = menu.stream().map(Dish::getName)
                .map(String::length)
                .collect(toList());

        assertThat(dishNameLengths).isNotEmpty();
        assertThat(dishNameLengths).hasSize(menu.size());
        for (Dish dish: menu){
            assertThat(dishNameLengths).contains(dish.getName().length());
        }

    }


    //flatmap
    @Test
    public void should_count_the_number_of_characteres_of_any_dish(){
        List<String> uniqueCharacters = menu.stream().map(dish -> dish.getName())
                                                     .map(s -> s.split(""))
                                                     .flatMap(Arrays::stream)
                                                     .distinct()
                                                     .collect(toList());


        assertThat(uniqueCharacters).isNotEmpty();
        assertThat(uniqueCharacters).hasSize(20);
    }

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
    public void should_count_number_of_calories_in_menu_using_reduce(){
        int calories = menu.stream() .map(Dish::getCalories)
                .reduce(0, Integer::sum);

        assertThat(calories).isEqualTo(4200);
    }

    //Mapping to a numeric stream
    @Test
    public void should_calculate_the_sum_of_calories_in_the_menu_using_sum(){
        int totalCalories = menu.stream().mapToInt(dish -> dish.getCalories()).sum();

        assertThat(totalCalories).isEqualTo(4200);

    }



}
