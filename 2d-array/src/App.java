public class App {
    public static void main(String[] args) throws Exception {
        
        // 1 d array
        String[] fruits = {"Apple", "Orange", "Banana"};
        String[] vegetables = {"Onion", "Carrot", "Raddish"};
        String[] meats = {"Pork", "Chicken", "Beef"};

        String[][] groceries = {fruits,vegetables,meats};

        groceries[0][0] = "Pineapple";

        for(String[] foods: groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
