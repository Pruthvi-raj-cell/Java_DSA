
public class Array {
    
    public static void main(String args[]){

      int nums[]={1,3,4,5};
      int nums1[]=new int[5];
      nums1[0]=1;
       nums1[1]=4;
        nums1[2]=5;
         nums1[3]=1;

        // System.out.println(nums[3]);
         //System.out.println(nums1[4]);

       // for(int i=0;i<nums1.length;i++)
      //  {
        //    System.out.println(nums1[i]);
       // }

        int nums3[][]=new int[4][5];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                nums3[i][j]=(int)(Math.random()*100);
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(nums3[i][j]+" ");
            }
            System.out.println();
        }

        double mg=Math.random();
        System.out.println(mg);
    }

}
