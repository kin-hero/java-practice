import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int score = 70;
        String passOrFail = (score >= 60) ? "You pass" : "You fail";
        System.out.println(passOrFail);
        
        Random random = new Random();
        int randomNumber = random.nextInt(0,10);
        String oddOrEven = (randomNumber % 2 == 0) ? "it is an even number" : "it is an odd number";
        System.out.printf("The random number was %d, so %s\n" ,randomNumber ,oddOrEven);

         int hours = 1;
         String timeOfDay = (hours >=12) ? "PM" : "AM";
         System.out.println("Time of the day is " + timeOfDay);

         int income = 60000;
         double taxRate = (income >= 40000) ? 0.25 : 0.15;
         System.out.println("Tax rate is " +  taxRate);
     
    }
}
