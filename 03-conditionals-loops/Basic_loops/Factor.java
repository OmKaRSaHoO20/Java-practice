package Basic_loops;
public class Factor {
    public static void main(String[] args) {
        int num = 30;
        for(int i = 1; i <= num; ++i){
            int factor = num % i;

            System.out.println("");
            
            if (factor == 0) {
                System.out.print(i + " ");
              }
        }
    }
}