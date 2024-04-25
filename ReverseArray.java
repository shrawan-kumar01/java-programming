public class ReverseArray {
    public static void printArray(int array[])
    {
        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i] + ",");
        }
    }

    // code for reversal array 
    public static void reverseArray(int array[],int start,int end)
    {
        int temp =array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;


    }
    public static void main(String [] args)
    {
        int num [] = {10,20,30,40,50};
        printArray(num);
        reverseArray(num, 0, num.length-1);
        System.out.println("array after reversal == ");
        printArray(num);


    }
}
