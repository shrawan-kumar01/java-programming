// return second max value . array have dubilacate values 

public class SecondMax {

    public int findSecondMAx(int array[])
    {
        int max = array[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 1; i <array.length;i++)
        {
            if(array[i] >max)
            {
                secondMax = max;
                max = array[i];
            }
            else if(array[i] < max && array[i] >secondMax)
            {
                secondMax = array[i];
            }
        }


        return secondMax;
    }


      public static void main(String[] args )
      {
        int array[] = {13,34,2,34,33,1};
        SecondMax sm = new SecondMax();
        int secondMax = sm.findSecondMAx(array);
        System.out.println("the second maximum value in the array is " + secondMax);
      }
}
