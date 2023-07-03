import java.util.Scanner;

public class ATMinterface {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000.0; // Let the account balance is 1000

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printMenu();
            int option = getUserChoice();
            switch (option) {
                case 1:
                    displayBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Quit");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void displayBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please try again.");
        } else {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
           //////// System.out.println("Curre");////////
        }
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount. Please try again.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }
}
