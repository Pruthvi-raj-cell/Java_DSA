public class practice{
    public static void main(String[] args) {
        int a=1140201;
        float b = 1.54f;
        byte c = 127;//bite can have value up to -128 to 127
        short d = 12344;
        long e = 1234444444;//see the diff of short and long length
        boolean f = true;

                // type conver 

                b=(int)a;
                c=(byte)a;//1140201%256
                    System.out.println(b);
                    System.out.println(c);

                    if(c==-2){
                        System.out.println("NICE");
                        }
                    else if(c==-23){
                        System.out.println("HMM");
                        }
                    else{
                        System.out.println("OK");
                        }

                    int i =5;
                        while(i<=10){ 
                            System.out.println("Yo"+i);
                            i++;
                        } 

                                        do
                                        {
                                            System.out.println("FUCk" +i);
                                            i++;
                                        }
                                        while(i<=4);


                                                    for (int j = 1;j<=5;j++){
                                                        System.out.println("HeLLYEah" + j);
                                                    }


                                                    for (int j = 10;j>=5;j--){
                                                        System.out.println("BSDK" + j);
                                                    }


    }
}