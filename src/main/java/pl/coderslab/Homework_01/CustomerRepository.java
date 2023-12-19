package pl.coderslab.Homework_01;

public interface CustomerRepository {

    void add(Customer customer);

    void delete(Customer customer);
    void list();
}
