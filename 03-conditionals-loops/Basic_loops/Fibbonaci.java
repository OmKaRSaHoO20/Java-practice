package Basic_loops;
class FibonacciExample1{  
    public static void main(String args[])  
    {    
     int a=0,b=1,temp,i,count=7;    
     System.out.print(a+" "+b);    
        
     for(i=1;i<count;++i) 
     {    
      temp=a+b;    
      System.out.print(" "+temp);    
      a=b;    
      b=temp;    
     }    
      
    }}  