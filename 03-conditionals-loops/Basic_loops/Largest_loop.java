package Basic_loops;
import java.util.Scanner;

public class Largest_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, number = 0;
        System.out.println("Enter a number: ");
        while((x = in.nextInt()) != 0){
            System.out.println("Enter a number: ");
            if (x > number) {
                number = x;
            }
        }
        System.out.println("The largest number is: " + number);
        in.close();
    }
}
