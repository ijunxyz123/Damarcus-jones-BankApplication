package classes;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    public boolean addBranch(String branchName) {
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        return false;

    }
    private Branch findBranch (String branchName){
        return null;
    }
     public boolean listCustomer(String branchName){
        return false;
     }
}



