import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        float a = in.nextFloat();
        System.out.println("Enter number 2:");
        float b = in.nextFloat();

        if (a > b){
            System.out.println("a is largest");
        }
        else{
            System.out.println("b is largest");
        }
        in.close();
    }
}
