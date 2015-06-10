package org.jduchess.handson.streams;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.jduchess.handson.Dish;
import org.jduchess.handson.TestBase;
import org.junit.Test;

//Collecting Data
public class Exercise2 extends TestBase {


    //reducing and sumarizing
    @Test
    public void should_count_number_of_dishes(){
        long howManyDishes = 0;
        
    	// ADD CODE HERE

        assertThat(howManyDishes).isEqualTo(9);
    }


    //groupingBy
    @Test
    public void should_group_dishes_by_type(){
        Map<Dish.Type, List<Dish>> dishMap = null;
        
    	// ADD CODE HERE

        assertThat(dishMap).containsKeys(Dish.Type.FISH, Dish.Type.MEAT, Dish.Type.OTHER);


    }

    //comparator & maxBy
    @Test
    public void should_get_max_calorie_dish(){
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish = Optional.empty();

    	// ADD CODE HERE

        assertThat(mostCalorieDish.isPresent()).isTrue();
        assertThat(mostCalorieDish.get().getName()).isEqualTo("pork");

    }

    //summingInt
    @Test
    public void should_count_total_number_of_calories(){
        int totalCalories = 0;
        
    	// ADD CODE HERE

        assertThat(totalCalories).isEqualTo(4200);
    }
    
    //joining
    @Test
    public void should_join_vegetarian_dish_names() {
    	String joined = "";
    	
    	// ADD CODE HERE
        
        assertThat(joined).isEqualTo("french fries,rice,season fruit,pizza");
    }
    
    //getAsList
    @Test
    public void should_get_vegetarian_dish_names_in_list() {
    	List<String> list = Collections.emptyList();
    	
    	// ADD CODE HERE
        
        assertThat(list).containsExactly("french fries","rice","season fruit","pizza");
    }
    


}
