import java.util.Scanner;
public class ScannerInterest {

    public static void main(String[] args) {
        double amountMoney;
        double principalAmount;
        double interestRate;
        double compounded;
        double time;

        System.out.print("What is the original principal? ");


        Scanner scnr = new Scanner(System.in);
        principalAmount = scnr.nextInt();

        System.out.print("What is the annual interest rate? ");
        interestRate = scnr.nextInt();

        System.out.print("How many times per year is interest compounded? ");
        compounded = scnr.nextInt();

        System.out.print("For how many years will interest be compounded? ");
        time = scnr.nextInt();

        amountMoney = principalAmount * (Math.pow(( 1+ interestRate/compounded), (compounded * time)));

        System.out.printf("After " + time + " years you will have " + amountMoney);



    }
}
