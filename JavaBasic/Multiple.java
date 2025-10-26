import java.util.*;
class Multiple{
   
   public static int Mul(int a){
    
    for(int i = 0; i<=10 ; i++ ){
        System.out.println( a+"X"+i+"="+a*i);
    }
    return -1;
   }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int a = sc.nextInt();
        Mul(a);
    }
}