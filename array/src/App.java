import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // array = store the same data type
        // array is a reference data type

        String[] fruits = {"Apple", "Banana", "Orange", "Coconut"};
        Arrays.sort(fruits);
        // Arrays.fill(fruits, "Dragon Fruit");
        // System.out.println(fruits);  [Ljava.lang.String;@2b2fa4f7
        // fruits[0] = "Pineapple";
        int numOfFruits = fruits.length;

        for(int i = 0; i < numOfFruits; i++ ){
            System.out.println(fruits[i]);
        }

        System.out.println("\nEnhanced For Each Loop\n");
        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
