public class ReturnOdd {

    public static void printArray(int array[])
    {
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + ",");
        }
    }

    public static int[] returnOdd(int array[])
    {
        int oddCount =0;
        // statement for odd count 
        for(int i = 0;i < array.length;i++)
        {
            if(array[i] % 2 != 0);
            oddCount ++;
        }
        
        // creating array with odd numbers
        int oddArray[] = new int[oddCount];
        int idx = 0;
        for(int i=0;i<oddArray.length;i++)
        {
            if(array[i] %2 !=0)
            {
                oddArray[idx] = array[i];
                idx ++;
            }
        }
        
        return oddArray;
    }
    public static void main(String[] args)
    {
        int array[] = {12,13,14,2,1,2,100,59,21};
        printArray(array);
        System.out.println("odd array is ~ ");
        // returnOdd(array);
       int result [] = returnOdd(array);
       printArray(result);
    }
}
