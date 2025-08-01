import java.util.*;
public class Factorial {
    static int Fact(int n)
    {
        if(n==1)
        return 1;
        else
        return n*Fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=obj.nextInt();
        System.out.println("The factorial of the numbers is "+Fact(num));
    }
}
