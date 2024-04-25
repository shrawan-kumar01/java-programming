// count the no of triplet whose sum is equals to X
import java.util.Scanner;

public class NoOfTripletSumEqulX {
 
    
    // triplet function 
    public static int tripletSum(int array [] ,int  targetValue)
    {
        int count = 0;
        int n = array.length;
        for(int i = 0; i < n ;i++)
        {
            for(int j = i+1; j<n;j++)
            {
                for(int k = j+1;k<n;k++)
                {
                    if(array[i] + array[j] + array[k] == targetValue)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter target value ");
        int target = s.nextInt();
        System.out.println("enter array size ");
        int size = s.nextInt();

        int array [] = new int [size];
        System.out.println("enter array values ");
        for(int i =0 ; i<size;i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("result");
        System.out.println(tripletSum(array, target));
        s.close();

    }
}
