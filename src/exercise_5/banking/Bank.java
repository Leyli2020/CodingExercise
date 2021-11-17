package exercise_5.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch != null) {
            return tempBranch.newCustomer(customerName, transaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch != null) {
            return tempBranch.addCustomerTransaction(customerName, transaction);
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch != null) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            ArrayList<Customer> branchCustomers = tempBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (printTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
