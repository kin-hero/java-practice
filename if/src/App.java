import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        boolean isStudent;
        System.out.print("Are you a student(true/false) : ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("You did not enter your name!");
        } else {
            System.out.println("Hello " + name );
        }

        //GROUP 2

        if (age >= 65) {
            System.out.println("You are a senior, enjoy retirement");
        }        
        else if (age >= 18){
            System.out.println("You are an adult, enjoy your beer 🍺");
        }
        else if (age < 0) {
            System.out.println("You have not been born yet!");
        }
        else if (age == 0) {
            System.out.println("You are a baby!");
        }        
        else {
            System.out.println("You are a child, no alcohol for you");
        } 

        //GROUP 3
        if(isStudent){
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
