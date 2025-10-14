import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many favorite foods do you have? ");
        int numberOfFavoriteFood = scanner.nextInt();
        // Empty array, must set the size
        String[] foods = new String[numberOfFavoriteFood];
        scanner.nextLine();
        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter your favorite food: ");
            foods[i] = scanner.nextLine();
        }
        
        System.out.println("Your favorite foods are: ");
        for (String food: foods){
            System.out.println(food);
        }


        scanner.close();
    }
}
