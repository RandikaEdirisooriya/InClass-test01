package lk.ijse.Beans;

import lk.ijse.Contract.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishBun implements Food {
    @Override
    public void like() {
        System.out.println("FishBun");
    }
}
