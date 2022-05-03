import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Principal: ");
        float p = in.nextFloat();
        System.out.println("Enter the value of Time: ");
        float t = in.nextFloat();
        System.out.println("Enter the value of Rate: ");
        float r = in.nextFloat();

        float si = (p * t * r)/100;

        System.out.println(si);
        in.close();
    }
}
