import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;

public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter Second number");
        int b = in.nextInt();
        System.out.println("Enter Third number");
        int c = in.nextInt();

        MIN(a, b, c);
        MAX(a, b, c);

        in.close();
    }

    static void MAX(int a,int b, int c){
        if(a > b && a > c){
            System.out.println("a is the maximum number with value of "+ a);
        }
        else if(b > a && b > c){
            System.out.println("b is the maximum number with value of "+ b);
        }
        else if (c > b && c > a){
            System.out.println("c is the maximum number with value of "+ c);
        }
    }
    static void MIN(int a,int b, int c){
        if(a < b && a < c){
            System.out.println("a is the minimum number with value of "+ a);
        }
        else if(b < a && b < c){
            System.out.println("b is the minimum number with value of "+ b);
        }
        else if(c < a && c < b){
            System.out.println("c is the minimum number with value of "+ c);
        }
    }
}
