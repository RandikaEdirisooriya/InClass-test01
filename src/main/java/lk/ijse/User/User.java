package lk.ijse.User;

import jakarta.annotation.PostConstruct;
import lk.ijse.Contract.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {


     public Food food;

    @Autowired
    @Qualifier
    public void setFood(Food food){
        this.food = food;
    }
    @PostConstruct
    public void init(){
        System.out.println(food +"c");
        food.like();
    }
}
