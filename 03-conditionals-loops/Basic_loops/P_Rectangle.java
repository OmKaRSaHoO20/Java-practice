package Basic_loops;
import java.util.Scanner;

public class P_Rectangle {
    public static void main(String[] args) {
      float a ,b, c, d, perimeter;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the length of first side : ");
      a = in.nextFloat();
      System.out.print("Enter the length of second side : ");
      b = in.nextFloat();
      c = a;
      d = b;
      System.out.printf("The length of the sides of the Rectangle are %.2f %.2f %.2f %.2f", a, b, c, d);
      perimeter = a + b + c + d;
      System.out.printf("\nThe perimeter of Rectangle is: %.2f",perimeter);
      in.close();
    }
}

// similarly
// Perimeter Of Circle
// Perimeter Of Equilateral Triangle
// Perimeter Of Parallelogram
// Perimeter Of Rectangle
// Perimeter Of Square
// Perimeter Of Rhombus