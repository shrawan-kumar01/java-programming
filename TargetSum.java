// target sum equals to 7 of the array . write a java programm 
import java.util.Scanner;

class TargetSum
{

    public static int targetSum(int array[], int targetValue)
    {
        
        int count = 0;
        
        for(int i = 0;i <array.length;i++)// taking first num
        {
            for(int j = i +1; j<array.length;j++)// taking second num 
            {
                if(array[i] + array[j] == targetValue)
                {
                    count ++;
                }
            }
            // System.out.println(count);
        }
        return count;
    }
    public static void main(String args [])
    {
        System.out.println("targeted sum programm ");
        int n =6;
        int array [] = new int [n];
        System.out.println("enter aray values ");
        Scanner s = new Scanner(System.in);
        for(int i = 0;i <array.length;i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("enter target value");
        n = s.nextInt();

        // System.out.println(array);

        System.out.print(targetSum(array, n));
        s.close();


    }
}

// op : targeted sum programm 
// enter aray values
// 1
// 6
// 5
// 2
// 4
// 3
// enter target value
// 7
// 3