// write a java prog to move all zeros in array to the end and maintain the rea;tive order of the non zeros element 
public class MoveZeroToEnd {

    public void moveZeros(int array[], int n)
    {
        int j = 0;   // pointer to hold zero 
        for(int i = 0; i <array.length;i++)
        {
            if(array[i] != 0  && array[j] == 0)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            else if(array[j] != 0 )
            {
                j++;
            }
        }
    }
    public static void main(String[] args)
    {
        int array[] = {8,1,0,2,1,0,3,2,3,5,8,5,4,89};
        MoveZeroToEnd mze =new  MoveZeroToEnd();

        System.out.println("the new array is " );
        mze.moveZeros(array, array.length);
        // printing the array 
        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }


    }
}
