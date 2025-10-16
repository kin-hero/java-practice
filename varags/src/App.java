public class App {
    public static void main(String[] args) throws Exception {
        // varags = accept a varying # amount of arguments. Makes method more flexible and do not need to overload methdos
        int result = add(1,2,6);
        System.out.println("result " + result);

        double averageResult = average();
        System.out.println("averageResult " + averageResult);
        
        
    }

    static int add(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        int sum = 0;
        double average = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        
        average = sum / numbers.length;
        return average;
    }
}
