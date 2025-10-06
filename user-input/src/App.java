import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Your name is " + name );

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // System.out.println("You are " + age + " years old" );

        // System.out.print("Enter your GPA: ");
        // double gpa = scanner.nextDouble();
        // System.out.println("Your GPA is " + gpa);        
 
        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();
        // if(isStudent){
        //     System.out.println("You are a student");                
        // } else {
        //     System.out.println("You are not a student");                
        // }

        // COMMON ISSUES
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old" );
        System.out.println("You like the color " + color );



        scanner.close();
    }
}
