import java.util.*;

public class Fact {
    public static int fac(int n){
       if(n==0||n==1){
        return 1 ; 
       }else{
         return n*fac(n-1);
       }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want the fac of : ");
        int n = sc.nextInt();
           System.out.println(fac(n)); 
    }
    
}
