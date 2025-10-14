public class App {
    public static void main(String[] args) throws Exception {
        // overloaded methods = method that share the same name but different parameters
        // signature = name + parameters 
        // Duplicate method name is okay as long as they have different paremeters

        // System.out.println(add(0, 2, 3));

        String pizza = bakePizza("Flat Bread");
        String pizzaWithCheese = bakePizza("Flat Bread", "Mozzarella");
        System.out.println("Pizza is " + pizza);
        System.out.println("Pizza is " + pizzaWithCheese);
    }

    static double add(double num1, double num2){
        return num1 + num2;
    }
    static double add(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }    

    static String bakePizza(String bread){
        return bread + "Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + "Pizza with " + cheese;
    }    
}
