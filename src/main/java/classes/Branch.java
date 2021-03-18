package classes;

import interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch (String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    @Override
    public boolean newCustomer( String customerName, double initialTransaction){
        if(findCustomer(customerName)==null && !customerName.equals("")&& initialTransaction>=0){
            Customer customer = new Customer(customerName, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        else return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName,double transaction){
        return false;
    }

    @Override
    public Customer findCustomer(String customerName){
        return null;
    }
}
