package org.jduchess.handson.streams;

import org.assertj.core.util.Lists;
import org.jduchess.handson.Dish;
import org.jduchess.handson.TestBase;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


//Intermediate & terminal Operations
public class Exercise1 extends TestBase {

    @Test
    public void should_find_out_all_vegetarian_dishes(){
        List<Dish> vegetarianDishes = Lists.newArrayList();

        // ADD CODE HERE

        assertThat(vegetarianDishes).isNotEmpty();
        assertThat(vegetarianDishes).hasSize(4);

    }

    @Test
    public void should_collect_all_dishes_names(){
        List<String> names = Lists.newArrayList();

        // ADD CODE HERE

        assertThat(names).isNotEmpty();
        assertThat(names).hasSize(menu.size());

    }

    @Test
    public void should_find_out_how_many_distinct_types_of_dishes(){
        long count = 0;

        // ADD CODE HERE

        assertThat(count).isEqualTo(3);

    }

    @Test
    public void should_get_any_fish_dish(){

        Optional<Dish> anyFishDish = Optional.empty();

        // ADD CODE HERE

        assertThat(anyFishDish.isPresent()).isTrue();
        assertThat(anyFishDish.get().getType()).isEqualTo(Dish.Type.FISH);


    }

    @Test
    public void should_find_out_the_legth_of_the_name_of_each_dish(){
        List<Integer> dishNameLengths = Lists.newArrayList();

        // ADD CODE HERE

        assertThat(dishNameLengths).isNotEmpty();


    }

    @Test
    public void should_count_the_number_of_characteres_of_any_dish(){
        List<String> uniqueCharacters = Lists.newArrayList();

        // ADD CODE HERE

        assertThat(uniqueCharacters).isNotEmpty();
    }

    @Test
    public void should_find_out_three_high_calorie_dish_names(){
        List<String> highCalorieDishes = Lists.newArrayList();

        // ADD CODE HERE

        assertThat(highCalorieDishes).isNotEmpty();
        assertThat(highCalorieDishes).hasSize(3);
    }

    @Test
    public void should_count_number_of_dishes_using_reduce(){
        int count = 0;

        // ADD CODE HERE

        assertThat(count).isEqualTo(9);
    }

    @Test
    public void should_count_number_of_calories_in_menu_using_reduce(){
        int calories =0;

        // ADD CODE HERE

        assertThat(calories).isEqualTo(4200);
    }



}
