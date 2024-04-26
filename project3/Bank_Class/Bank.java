import java.util.*;
public class Bank {

    private ArrayList<Customer> bankList = new ArrayList<>();

    public void addCustomer(Customer customer){
        bankList.add(customer);
    }
    public void removeCustomer(Customer customer){
        bankList.remove(customer);
    }

    public Customer getCustPin(int pin){
        Customer foundCust = null;
        for(Customer customer: bankList){
            if(customer.getPin() == pin){
                foundCust = customer;
                break;
            }
        }
        return foundCust;
    }
    public StringBuilder getAllACustomer(){
        StringBuilder accounts = new StringBuilder();
        for(Customer acc : bankList ){
            accounts.append(acc + "\n");
        }
        return accounts;



    }



}
