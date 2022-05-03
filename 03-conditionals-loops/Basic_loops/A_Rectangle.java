package Basic_loops;
import java.util.Scanner;
public class A_Rectangle{
    public static void main(String[] args) {
      int length, breadth, area;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the length of the rectangle ::");
      length = in.nextInt();
      System.out.println("Enter the breadth of the rectangle ::");
      breadth = in.nextInt();
      area = length* breadth;
      System.out.println("Area of the rectangle is ::"+area);
      in.close();
   }
}

// similarly
// Area Of Circle Java Program
// Area Of Triangle
// Area Of Rectangle Program
// Area Of Isosceles Triangle
// Area Of Parallelogram
// Area Of Rhombus
// Area Of Equilateral Triangle