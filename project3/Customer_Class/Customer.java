import java.util.*;
public class Customer {
    private String first, last;
    private int pin;

    private static ArrayList<Account> customerAcc = new ArrayList<>();

    public Customer(String first, String last, int pin){
        this.first = first;
        this.last = last;
        this.pin = pin;
    }

    public String getName(){
        return first + last;
    }
    public int getPin(){
        return pin;
    }
    public void setName(String first, String last){
        this.first = first;
        this.last = last;
    }
    public void setPin(int pin){
        this.pin = pin;
    }

    public void addAccount(Account acc){
        customerAcc.add(acc);
        System.out.println("New Account Opened, " + acc);
    }

    public static void deleteAccount(Account acc){
        customerAcc.remove(acc);
        System.out.println("Account " + acc.getAccNum() + " closed");
    }

    public Account getOneAccount(int account){
        Account foundAcc = null;
        for(Account acc: customerAcc){
            if(acc.getAccNum() == account){
                foundAcc= acc;
                break;
            }
        }
        return foundAcc;
    }

    public StringBuilder getAllAccount(){
        StringBuilder accounts = new StringBuilder();
        for(Account acc : customerAcc ){
            accounts.append(acc + "\n");
        }
        return accounts;
    }

    @Override
    public String toString(){

        return String.format("Customer name: %s %s\nPin:  %d\n %s",first, last, pin, getAllAccount());
    }

}



