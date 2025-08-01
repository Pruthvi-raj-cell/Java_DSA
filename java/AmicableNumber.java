import java.util.Scanner;
public class AmicableNumber{
    public static void main(String[] args) {
        int firstnumbersum=0,secondnumbersum=0,firstnumber,secondnumber;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        firstnumber=sc.nextInt();
        System.out.print("Enter the Second Number : ");
        secondnumber=sc.nextInt();
         for(int i=1;i<firstnumber;i++)
         {
            if(firstnumber%i==0)
            {
                firstnumbersum=firstnumbersum+i;
            }
         }
         for(int i=1;i<secondnumber;i++)
         {
            if(secondnumber%i==0)
            {
                secondnumbersum=secondnumbersum+i;
            }
         }
         if(firstnumber==secondnumbersum && secondnumber==firstnumbersum)
         {
            System.out.println("is an amicable number");
         }
         else{
            System.out.println("Not an amicable number");
         }
    }
}