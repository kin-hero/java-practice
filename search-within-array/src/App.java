import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,5,6,7,8,10,12,2};
        int target = 61;
        String[] fruits = {"Apple", "Orange", "Banana"};
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        String stringTarget = scanner.nextLine();

        // linear search
        // for (int i = 0; i < numbers.length; i++){
        //     if(numbers[i] == target){
        //         System.out.println("Element found at index: " + i);
        //         isFound = true;
        //         break;
        //     }
        // }

        for (int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(stringTarget)){
                System.out.println("The fruit found at index: " + i);
                isFound = true;
                break;
            }
        }        

        if(!isFound){
            System.out.println("The number / fruit is not available in the array");
        }

        scanner.close();
    }
}
