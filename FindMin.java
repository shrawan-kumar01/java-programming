// find mimnum of the array 
class FindMin
{

    public int findMin(int array[])
    {   
        if(array.length == 0 || array ==null)
        {
            throw new IllegalArgumentException("invalid input ");
        }
        int min = array[0];
            for(int i = 1;i<array.length;i++)
            {
                if(array[i] < min)
                {
                    min=array[i];
                }
            }
        return min;
        }
    
    public static void main(String[] args)
    {   

        int array[] = {21,20,1,23,5,69};
        FindMin fm = new FindMin();
        int minimum  = fm.findMin(array);
        System.out.println("minimum value is :~ "+ minimum);


    }
}