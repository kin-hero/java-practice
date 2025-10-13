import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // while loop = repeat some code forever
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(name.isEmpty()){
            // Within the while loop, have some way to update your condition
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
        scanner.close();
    }
}
