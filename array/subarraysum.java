package array;
public class subarraysum
{
    public static void sub_Array(int number[])
    {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++)
        {
            for(int j=i;j<number.length;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=number[k];
                }
                System.out.println(sum);
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
            }
        }
        System.out.println("the maximum subarray value is"+maxsum);
    }
    public static void main(String args[])
    {
        int number[]={2,4,6,8,10};
        sub_Array(number);
    }
    
}
