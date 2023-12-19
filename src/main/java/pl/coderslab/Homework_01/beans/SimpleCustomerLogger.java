package pl.coderslab.Homework_01.beans;

import org.springframework.stereotype.Component;
import pl.coderslab.Homework_01.Customer;
import pl.coderslab.Homework_01.CustomerLogger;
import java.sql.Time;
import java.time.LocalDateTime;


@Component
public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + " : Customer operation");
    }


}
