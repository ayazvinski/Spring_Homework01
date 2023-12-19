package pl.coderslab.Homework_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.coderslab.Homework_01.beans.MemoryCustomerRepository;
import pl.coderslab.Homework_01.beans.SimpleCustomerLogger;

@SpringBootApplication
public class Homework01Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SimpleCustomerLogger logger = context.getBean(SimpleCustomerLogger.class);
		logger.log();

		MemoryCustomerRepository customerRepository = context.getBean(MemoryCustomerRepository.class);
		Customer customer = new Customer("12345","Jan","Nowak");
		customerRepository.add(customer);
		customerRepository.list();


	}

}
