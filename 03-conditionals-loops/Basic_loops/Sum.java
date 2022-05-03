package Basic_loops;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,sum = 0;
        System.out.println("Enter a number: ");
        while((x = in.nextInt()) != 0){
            System.out.println("Enter a number: ");
            sum = sum + x;
        }
        System.out.println("The final value is: " + sum);
        in.close();
    }
}
