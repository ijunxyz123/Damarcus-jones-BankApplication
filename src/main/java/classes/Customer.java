package classes;

import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
        if (!name.equals("")) {
            this.name = name;
            this.transactions = new ArrayList<>();
            this.transactions.add(initialTransaction);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    @Override
    public void addTransaction(double transaction) {
        if (transaction >= 0) {
            this.transactions.add(transaction);
        }
    }
}