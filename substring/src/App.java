import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");

        String email = scanner.nextLine();
        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);
    
            System.out.println("Username : " + username);
            System.out.println("Domain : " + domain);
        } else {
            System.out.println("Email must contain an @ ");
        }


        scanner.close();
    }
}
