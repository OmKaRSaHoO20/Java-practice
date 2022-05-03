package Intermediate;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,num,fac = 1;
        num = in.nextInt();
        for(i = 1;i <= num ; i++){
            fac = fac*i;
        }
        System.out.println("The factorial of "+ num +" is "+ fac);
        
        in.close();
    }
}
