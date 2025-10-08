import java.util.Scanner;

public class MathOperations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    System.out.print("Enter the length of side A: ");
    a = scanner.nextDouble();
    System.out.print("Enter the length of side B: ");
    b = scanner.nextDouble();
    
    double inside = Math.pow(a,2) + Math.pow(b,2);
    c = Math.sqrt(inside);
    System.out.println("The hypotenuse is : " + c);

    double radius;
    System.out.print("Enter the radius of the circle: ");
    radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    System.out.printf("The circumference of the circle is %.1f\n" , circumference);

    double area = Math.PI * Math.pow(radius, 2);
    System.out.printf("The area of the circle is %.1f\n" , area);    

    double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    System.out.printf("The volume of the sphere is %.1f\n" , volume);    


    scanner.close();
  }  
}

