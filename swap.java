import java.util.*;
 
class swap {
 
    // Function to swap two numbers
    // Using temporary variable
    static void swapValuesUsingThirdVariable(int m, int n)
    {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
    }
 
    // Main driver code
    public static void main(String[] args)
    {

        int m = 3, n = 5;

        swapValuesUsingThirdVariable(m, n);
    }
}