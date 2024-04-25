//  find unique number in the array . were every number is repeted twice except one number 
import java.util.Scanner;
public class FintUnique {
    
    public static int findUnique(int array[])
    {   
        int unique =0;
        int n = array.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(array[i] == array[j])
                {
                    array[i] = -1;
                    array[j] = -1;

                }
            }
        }
        for(int i =0;i < n;i++)
        {
            if(array[i] >0)
            {
                unique = array[i];
            }
        }
        return unique;

    
    }

    public static void main(String args [])
    {
        System.out.println("unique num detection  ");
        int n =7;
        int array [] = new int [n];
        System.out.println("enter aray values ");
        Scanner s = new Scanner(System.in);
        for(int i = 0;i <array.length;i++)
        {
            array[i] = s.nextInt();
        }
       
        System.out.print("unique number is ");
        System.out.print(findUnique(array));
        s.close();
    }
}
