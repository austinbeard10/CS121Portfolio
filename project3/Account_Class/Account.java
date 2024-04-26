
public class Account {

    private double balance;
    private int accNum;
    static int numOfAcc = 1000;

    public Account(double deposit){

        this.balance = deposit;

        this.accNum = numOfAcc;
        numOfAcc++;
    }

    public void depositMoney(double deposit){
        balance = balance + deposit;
       // balance = balance + deposit;
        System.out.printf("Balance $%.2f\n", balance);
    }

    public void withdrawMoney(double withdraw){
        if(withdraw > balance){
            System.out.println("Insufficient Funds");
        }else{
            balance = balance - withdraw;
            System.out.printf("You withdrew:$%.2f\n Your new balance is:$%.2f\n", withdraw,balance);
        }

    }

    public double getBalance(){
        return balance;
    }
    public int getAccNum(){
        return accNum;
    }
    public int getNumAcc(){
        return numOfAcc;
    }

    public void setAccNum(int accNum1){
        this.accNum = accNum1;
    }

    @Override
    public String toString(){

        return String.format("Account Number: %s\nBalance: $%.2f\n",accNum, getBalance());
    }

}
