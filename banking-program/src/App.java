import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // JAVA BANKING PROGRAM FOR BEGINNERS
        double balance = 100;
        boolean isRunning = true;
        int choice; 

        while (isRunning) {
            System.out.println("******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit program");
            System.out.println("******************");
            
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    double amountDeposited = deposit();
                    System.out.println("Successfully deposited $" + amountDeposited);
                    balance += amountDeposited;
                    showBalance(balance);
                }
                case 3 -> {
                    double amountWithdrawed = withdraw(balance);
                    System.out.println("Successfully withdrawed $" + amountWithdrawed);
                    balance -= amountWithdrawed;
                    showBalance(balance);
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("You have exited the banking program");
                }
                default -> System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println();
        System.out.println("******************");
        System.out.printf("Account balance is: $%.2f\n", balance);
        System.out.println();
    }

    static double deposit(){
        System.out.println();
        System.out.println("******************");
        System.out.print("Enter an amount to deposit: ");
        double amount = scanner.nextDouble();
        while(amount<=0){
            System.out.println("Amount cannot be negative or 0");
            System.out.print("Enter an amount to deposit (>0): ");
            amount = scanner.nextDouble();
        }
        return amount;
    }

    static double withdraw(double balance){
        System.out.println();
        System.out.println("******************");
        System.out.print("Enter an amount to withdraw: ");
        double amount = scanner.nextDouble();
        while(amount > balance || amount <= 0){
            if(amount > balance){
                System.out.println("You cannot withdraw a sum of money that is larger than your current balance ");
            } else {
                System.out.println("Withdraw amount cannot be negative or 0");
            }
            showBalance(balance);
            System.out.print("Enter an amount to withdraw : ");
            amount = scanner.nextDouble();
        }        
        return amount;
    }
}
