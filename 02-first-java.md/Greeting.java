import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = in.next();
        System.out.println("Good morning," + name + ", have a good day");
        in.close();
    }
}
