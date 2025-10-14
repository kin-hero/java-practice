public class App {
    public static void main(String[] args) throws Exception {
        String firstName = "John";
        String lastName = "Cena";
        int age = 12;
        
        // arguements
        happyBirthday(firstName, age);
        
        double resultOfSquare = getSquare(age);
        double resultOfCube = getCube(age);
        System.out.println("The result of the square is: " + resultOfSquare);
        System.out.println("The result of the cube is: " + resultOfCube);

        String fullname = getFullName(firstName, lastName);
        System.out.println("My fullname is: " + fullname);

        boolean validAge = validateAgeLimitToVote(age);
        if (validAge){
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you! ");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    };

    static double getSquare(double number){
        return number * number;
    }

    static double getCube(double number){
        return number * number * number;
    }    

    static String getFullName (String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean validateAgeLimitToVote (int age){
        return age >= 18;
    }

}
