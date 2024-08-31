package lk.ijse.Beans;

import lk.ijse.Contract.Food;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier
public class pastry implements Food {
    @Override
    public void like() {
        System.out.println("pastry");
    }
}
