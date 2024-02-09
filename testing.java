import java.util.Scanner;

public class testing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double annualInterestRate;
        double period;
        double monthlyInterestRate;
        double numberOfPayments;
        double mortgage;

        System.out.print("What is your principal?");
        principal = scanner.nextDouble();

        System.out.print("What is the annual interest rate?");
        annualInterestRate = scanner.nextDouble();

        System.out.print("How many years?");
        period = scanner.nextDouble();

        // Convert annual interest rate to monthly and number of years to months
        monthlyInterestRate = annualInterestRate / 100 / 12;
        numberOfPayments = period * 12;

        // Calculate mortgage using the correct formula
        mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Period (Years): " + period);
        System.out.println("Mortgage: " + mortgage);
    }
}