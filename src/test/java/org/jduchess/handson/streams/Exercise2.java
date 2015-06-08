package org.jduchess.handson.streams;


import org.jduchess.handson.Dish;
import org.jduchess.handson.TestBase;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;
import static org.assertj.core.api.Assertions.assertThat;

//Collecting Data
public class Exercise2 extends TestBase {


    //reducing and sumarizing
    @Test
    public void should_count_number_of_dishes(){
        long howManyDishes = menu.stream().collect(counting());

        assertThat(howManyDishes).isEqualTo(9);
    }


    //groupingBy
    @Test
    public void should_group_dishes_by_type(){
        Map<Dish.Type, List<Dish>> dishMap = menu.stream().collect(groupingBy(Dish::getType));

        assertThat(dishMap).containsKeys(Dish.Type.FISH, Dish.Type.MEAT, Dish.Type.OTHER);


    }

    //comparator & maxBy
    @Test
    public void should_get_max_calorie_dish(){
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish = menu.stream().collect(maxBy(dishCaloriesComparator));

        assertThat(mostCalorieDish.isPresent()).isTrue();
        assertThat(mostCalorieDish.get().getName()).isEqualTo("pork");

    }

    //summingInt
    @Test
    public void should_count_total_number_of_calories(){
        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));

        assertThat(totalCalories).isEqualTo(4200);
    }


}
