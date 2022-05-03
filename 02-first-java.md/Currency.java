import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter currency in Rupees: ");
        float rupees = in.nextFloat();
        
        double USD = rupees * 76.54 ;

        System.out.println(USD);
        in.close();
    }
}
