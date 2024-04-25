// import java.util.Arrays;
// given an array return array with only odd number 
public class FindEven
{   
    public static void main(String[] args)
    {
        int array [] = {1,2,4,5,7,13,12};
        int oddCount = 0;
        int n = array.length;
        for(int i =0;i < n;i++)
        {
            if(array[i] % 2 !=0)
            {
                oddCount++; 
            }
        }
        int oddArray [] = new int[oddCount];
        int idx = 0;
        for(int i=0;i<n;i++)
        {
            if(array[i] %2 !=0)
            {
                oddArray[idx] = array[i];
                idx++;
            }
        }
        System.out.println("The odd array is :~ ");

        for(int i = 0;i<oddArray.length;i++)
        {
            System.out.print(oddArray[i] + ",");
        }
    }
}