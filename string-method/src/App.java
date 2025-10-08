public class App {
    public static void main(String[] args) throws Exception {
        String name = "pasSword";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("e");
        name = name.toUpperCase();
        name = name.toLowerCase().trim();
        name = name.replace("e","a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());
        

        if (name.contains(" ")){
            System.out.println("Your name contain a space");
        } else {
            System.out.println("Your name does not contain a space");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cannot be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
