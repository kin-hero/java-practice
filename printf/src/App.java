public class App {
    public static void main(String[] args) throws Exception {
        // %[flags][width][.precision][specific-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your first name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age );
        System.out.printf("You are a %.1f inches tall\n", height);
        System.out.printf("Employed Status %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // Flags
        // + = output a plus
        // , = output a comma for thousands
        // ( = negative numbers are enclosed within this bracket ()
        // space = display minus if negative but space if positive

        double price1 = 9000.99;
        double price2 = 10000.15;
        double price3 = -5400.01;
        System.out.printf("%,+.1f\n", price1);
        System.out.printf("%,+.2f\n", price2);
        System.out.printf("%(,.3f\n", price3);


        // Width
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 234;
        int id4 = 2345;
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);        
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
