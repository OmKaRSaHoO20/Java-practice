import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your number: ");
    int a = in.nextInt();

    even_odd(a);

    in.close();
    }

    static void even_odd(int b){
        if(b % 2 == 0){
            System.out.print("Entered number is Even");
        }
        else{
            System.out.print("Entered number is Odd");
        }
    }
}