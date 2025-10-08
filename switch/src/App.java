import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday","Wednesday", "Thursday","Friday" -> System.out.println("It is a weekday 😭");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend 🤣");
            default -> System.out.println(day + " is not a day");
        };

        scanner.close();
    }
}
