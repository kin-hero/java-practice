public class App {
    public static void main(String[] args) throws Exception {
        // AND OR NOT
        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >=0 && isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("It is sunny outside ☀️");
        } 
        else if (temp <= 30 && temp >=0 && !isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("It is cloudy outside ☁️");
        }
        else if (temp > 30 || temp < 0){
            System.out.println("The weather is bad 😭");
        }
    }
}
