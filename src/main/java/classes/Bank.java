package classes;

import interfaces.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    @Override
    public boolean addBranch(String branchName) {
        if(findBranch(branchName)==null && !branchName.equals("")){
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        else return false;
    }

    @Override
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if(findBranch(branchName) != null){
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
        else return false;
    }

    @Override
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if(findBranch(branchName) != null){
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
        else return false;
    }

@Override
public boolean listCustomers(String branchName, boolean printTransactions) {
    if(findBranch(branchName) != null){
        Branch branch = findBranch(branchName);
        System.out.print("Customer details for branch " + branchName);
        if(printTransactions){
            for(Customer customer: branch.getCustomers()){
                System.out.printf("\nCustomer: %s[%d]", customer.getName(), branch.getCustomers().indexOf(customer)+1);
                System.out.print("\nTransactions");
                for(int i = 0; i < customer.getTransactions().size(); i++){
                    System.out.printf("\n[%d] Amount %f", i+1, customer.getTransactions().get(i));
                }
            }
        }
        else for(Customer customer: branch.getCustomers()) {
            System.out.printf("\nCustomer: %s[%d]", customer.getName(), branch.getCustomers().indexOf(customer)+1);
        }
        return true;
    }
    return false;
}

    private Branch findBranch(String branchName) {
        for(Branch branch: this.branches){
            if(branch.getName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        return null;
    }
}



