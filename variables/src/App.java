public class App {
    // Primitive = simple value stored directly in the memory (stack) "I owe you $10"
    /**
     * int
     * double
     * char
     * boolean
     */

    // Reference = memory address (stack) that points to the (heap) "Giving IOU saying that i owe you $10"
    /**
     * string
     * array
     * object
     */

    public static void main(String[] args) {
        int age = 31; 
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;
        
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Luffy";
        String food = "Ramen";
        String email = "luffy@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("My name is " + name );
        System.out.println("My favorite food is " + food);
        System.out.println("My GPA is " + gpa);
        System.out.println("My email is " + email);
        System.out.println("My car choice is a "+ color + " " + car);
        System.out.println("The price is "+ currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        } 
        else { 
            System.out.println("The " + car + " is not for sale");
        }

     }
    
}
