import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        AGEcheck(age);
        in.close();
    }
    static void AGEcheck(int umar) {
        if(umar >= 18){
            System.out.println("You are Legally allowed to vote");
        }
        else{
            System.out.println("You are Legally not allowed to vote");
        }
    }
}
