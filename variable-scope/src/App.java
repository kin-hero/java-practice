public class App {
    // Class scope or global scope
    static int x = 3 ;
    public static void main(String[] args) throws Exception {
        // local scope will always overwrite the class scope
        int x = 1;
        System.out.println(x);
        doSomething();
    }


    static void doSomething(){
        // local scope will always overwrite the class scope
        int x = 100;
        System.out.println(x);
    }
}
