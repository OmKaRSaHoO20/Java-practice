package Basic_loops;
import java.util.*;

public class V_Prism{
   public static void main(String args[]) 
    {   
        Scanner in= new Scanner(System.in);
        System.out.println("Enter area of base of prism : ");
        double base=in.nextDouble();
        System.out.println("Enter height of prism : ");
        double height=in.nextDouble();
        
        double  volume=base*height ;
        
        System.out.println("Volume Of Prism : " + volume);
        in.close();
   }
}


// similarly
// Volume Of Cone Java Program
// Volume Of Prism
// Volume Of Cylinder
// Volume Of Sphere
// Volume Of Pyramid