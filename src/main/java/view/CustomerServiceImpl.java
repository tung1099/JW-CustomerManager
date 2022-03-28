package view;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"John","john@xmail.com","Hanoi"));
        customers.put(2,new Customer(2,"Alex","alex@xmail.com","Danang"));
        customers.put(3,new Customer(3,"Rose","rose@xmail.com","Hoian"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
