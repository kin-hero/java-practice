import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operationSign;
        double result = 0;
        boolean isValidOperation = true;


        System.out.print("Enter your first number: ");
        number1 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operationSign = scanner.next().charAt(0);
        System.out.print("Enter your second number: ");
        number2 = scanner.nextDouble();
        
        switch(operationSign){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if(number2 == 0){
                    System.out.println("You cannot divide a number by 0");
                    isValidOperation = false;
                } 
                else {
                     result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.print("Please choose between + - * / ^ for your operator\n");
                isValidOperation = false;
            }
        }

        if(isValidOperation){
            System.out.println("The result of the operation is: "+ result);            
        }
        


        scanner.close();
    }
}
