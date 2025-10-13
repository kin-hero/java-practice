import java.util.Scanner;
public class Age {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age = 0;
    System.out.print("Enter your age : ");
    age = scanner.nextInt();

    // the code will always run at least once
    do{
      System.out.println("Your age cannot be negative");
      System.out.print("Enter your age : ");
      age = scanner.nextInt();
    }while(age<0);

    System.out.println("You are " + age + " years old");

    scanner.close();
  }
}
