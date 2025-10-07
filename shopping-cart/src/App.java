import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();
        System.out.print("How many " + item + " would you like? ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("The total price for the " + item + "/s" + " is " + currency + total);

        scanner.close();
        
    }
}
