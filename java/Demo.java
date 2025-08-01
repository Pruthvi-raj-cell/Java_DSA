 class Calculator{
    int a;
    public int add(int num1, int num2,int num3){
        int r=num1+num2+num3;

        return r;
    }
    public int sub(int num1,int num2,int num3){
        int s = num1-num2-num3;
        return s;
    }
}


public class Demo {
    public static void main(String[] args) {
        int num1=2;
        int num2=4;
        int num3=5;
        Calculator calc=new Calculator();
       int add=  calc.add(num1,num2,num3);
        
       int sub= calc.sub(num1, num2, num3);

       System.out.println("The addition for the given numbers is :"+add);
              System.out.println("The sub for the given numbers is :"+sub);

    }
    
}
