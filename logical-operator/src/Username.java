import java.util.Scanner;

public class Username {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String username; 
    System.out.println("Enter your username : ");
    username = scanner.nextLine();

    if (username.length() < 4 || username.length() > 12){
      System.out.println("Username must be between 4 to 12 characters ");
    } 
    else if (username.contains(" ") || username.contains("_")){
      System.out.println("Username must not contain empty space or underscore ");
    }
    else {
      System.out.println("Your username is valid, Welcome " + username);
    }

    scanner.close();
  }
}
