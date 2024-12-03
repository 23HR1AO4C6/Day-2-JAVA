   import java.util.*;
public class flippingbits{
    public static void main(String[] args){ 
        //Flipping bits
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a^(1<<b));
    }
}    
