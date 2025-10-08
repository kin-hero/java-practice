public class App {
    public static void main(String[] args) throws Exception {
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            } else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
        }

        System.out.printf("The price of the ticket will be: $%.2f\n", price);
    }
}
