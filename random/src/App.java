import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        number1 = random.nextInt(1,7);
        number2 = random.nextInt(1,7);
        number3 = random.nextInt(1,7);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        double double1;
        double1 = random.nextDouble();
        System.out.println(double1);
        

        boolean isHead; 
        isHead = random.nextBoolean();
        System.out.println(isHead);
        if(isHead){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
