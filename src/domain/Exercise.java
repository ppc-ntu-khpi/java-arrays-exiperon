package domain;

/**
 * The class provides the functionality to find all possible combinations for a 10 rung stair
 */
public class Exercise {
    public static int combinationsNumber = 0;

    public static int Calculate(){
        int[] numbers = new int[10];
        combinations(10, numbers, 0, 1);

        return combinationsNumber;
    }

    /**
     * Performs iteration over all possible combinations
     * @param number sum number
     * @param a array to fill with numbers
     * @param len array length
     * @param s number shift
     */
    public static void combinations(int number , int[] a, int len , int s)
    {
        if(number <= 0)
        {
            for( int j = 0 ; j < len ; j++ ) {
                //System.out.print(a[j] + " ");
            }
            //System.out.println();
            combinationsNumber++;

            return;
        }

        for(int i = s ; i <= number ; i++)
        {
            a[len] = i;
            combinations( number - i , a , len + 1 , i );
        }
    }
}
