package pl.coderslab.Homework_01.beans;

import org.springframework.stereotype.Component;
import pl.coderslab.Homework_01.Customer;
import pl.coderslab.Homework_01.CustomerLogger;
import pl.coderslab.Homework_01.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
@Component
public class MemoryCustomerRepository implements CustomerRepository {
    private final CustomerLogger logger;

    public MemoryCustomerRepository(CustomerLogger logger) {
        this.logger = logger;
    }

    public CustomerLogger getLogger() {
        return logger;
    }

    List<Customer> customerList = new ArrayList<>();


    @Override
    public void add(Customer customer) {
        customerList.add(customer);
        logger.log();
    }

    @Override
    public void delete(Customer customer) {
        customerList.remove(customer);
        logger.log();
    }

    @Override
    public void list() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        logger.log();
    }

}
