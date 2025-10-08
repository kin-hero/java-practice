import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's start converting your weight");
        System.out.print("Choose 1 if you want to convert from lbs to kg \nChoose 2 if you want to convert kg to lbs \nEnter your choice here: ");
        int conversionChoice = scanner.nextInt();

        double weight;
        double result;

        if(conversionChoice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            result = weight * 0.453592;
            System.out.printf("Your weight in kg is: %.2f\n", result);
        } else if (conversionChoice == 2){
            System.out.print("Enter your weight in kg: ");
            weight = scanner.nextDouble();
            result = weight * 2.20462;
            System.out.printf("Your weight in lbs is: %.2f\n", result);
        } else {
            System.out.println("Please choose a valid option (1 or 2) ");
        }

        scanner.close();
    }
}
