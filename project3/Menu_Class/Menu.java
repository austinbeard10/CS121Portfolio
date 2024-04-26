import java.util.*;
public class Menu {
    Scanner scnr = new Scanner(System.in);
    Bank bank = new Bank();

    public void displayMenu() {
        while (true) {
            System.out.println("*****MENU*****");
            System.out.println("Please make a selection: ");
            System.out.println("1) Access Account");
            System.out.println("2) Open New Account");
            System.out.println("3) Close All Accounts");
            System.out.println("4) Exit");
            int input = scnr.nextInt();
            if (input == 1) {
                accessAcc();
            } else if (input == 2) {
                openAcc();
            } else if (input == 3) {
                closeAcc();
            } else if (input == 4) {
                System.out.println("Thanks for using BSU Banking App, Goodbye.");
                break;
            } else {
                System.out.println("Invalid Entry");
            }

        }
    }

    public void accessAcc() {
        Customer customer;
        Account account;
        System.out.println("Please enter pin: ");
        int pin = scnr.nextInt();
        customer =bank.getCustPin(pin);
        if (customer == null) {
            System.out.println("Invalid Pin");

        } else {
            System.out.println(customer.getAllAccount());
            System.out.println("Enter Account Number: ");
            int accNum = scnr.nextInt();
            //String.valueOf(bank.getAllACustomer())
            //String foundAcc = bank.getAllACustomer();
            account = customer.getOneAccount(accNum);
            if (account == null) {
                //sout --println
                //souf -- printf
                System.out.println("invalid");
            }else {

                while (true) {
                    System.out.println("Please make a selection:");
                    System.out.println("1) Make a deposit");
                    System.out.println("2) Make a withdraw");
                    System.out.println("3) See account balance");
                    System.out.println("4) Close account");
                    System.out.println("5) Exit");
                    int input = scnr.nextInt();
                    if (input == 1) {
                        System.out.println("Enter amount of deposit: ");
                        int deposit = scnr.nextInt();
                        double amount = deposit;
                        account.depositMoney(amount);
                    } else if (input == 2) {
                        System.out.println("Enter amount of withdraw: ");
                        int with = scnr.nextInt();
                        double amount = with;
                        account.withdrawMoney(amount);
                    } else if (input == 3) {
                        System.out.printf("Balance is: $%.2f\n", account.getBalance());
                    } else if (input == 4) {
                        customer.deleteAccount(account);
                        return;
                    } else if (input == 5) {
                        break;
                    } else {
                        System.out.println("Invalid Entry");
                    }

                }

            }

        }
    }

    public void openAcc() {
        Customer customer;
        Account account;
        System.out.println("Are you a new customer?");
        System.out.println("1) Yes\n 2) No");
        int input = scnr.nextInt();
        if (input == 1)
        {
            customer= createNewCustomer();
        } //else if (input == 2) {
        else
        {
            System.out.println("Enter PIN: ");
            int pin = scnr.nextInt();
            customer = bank.getCustPin(pin);
            if (customer == null) {
                System.out.println("Invalid PIN");
               return;
            }else{
                System.out.println("Enter deposit amount: ");
                double deposit = scnr.nextInt();
                account  = new Account(deposit);
                customer.addAccount(account);
                System.out.println();
            }

        }

    }

    public Customer createNewCustomer() {
        System.out.println("Please Enter First Name:");
        String first = scnr.next();
        System.out.println("Please Enter Last Name:");
        String last = scnr.next();
        System.out.println("Enter a 4 digit PIN:");
        int pin = scnr.nextInt();
        Customer cust = new Customer(first, last, pin);
        System.out.println("Please enter deposit: ");
        double deposit = scnr.nextInt();

        Account acc = new Account(deposit);
        cust.addAccount(acc);
        bank.addCustomer(cust);
        return cust;

    }

    public void closeAcc(){
        Customer customer;
        System.out.println("Enter your PIN:");
        int input = scnr.nextInt();
        customer = bank.getCustPin(input);
        if(customer == null){
           return;
       }else {
           System.out.println(customer.getName() + " has been removed");
           bank.removeCustomer(customer);
       }
    }

}



