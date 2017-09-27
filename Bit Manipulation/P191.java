/*
 *  09/26/2017
 *  Problem 151 Reverse Words in a String
 *  Runtime O(n)
 *  Every time we, do n &  n -1, it flips the last beat of the n and return the result with 1 bit less
 */
public class P191 {
    public int hammingWeight(int n) 
    {
        if ( n == 0 ) return 0;
        int result = 1;
        while ((n & (n-1)) != 0 )
        {
            n = n & (n-1);
            result++;
        }
        return result;
    }
}
