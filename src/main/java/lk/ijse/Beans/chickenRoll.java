package lk.ijse.Beans;

import lk.ijse.Contract.Food;
import org.springframework.stereotype.Component;

@Component
public class chickenRoll implements Food {
    @Override
    public void like() {
        System.out.println("ChickenRoll");
    }
}
