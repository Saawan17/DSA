package org.dsa.basicmaths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 24323;
        int count = 0;

        System.out.println(countDigits(n));
        System.out.println(countDigitsBrute(n));
    }

    // T.C = 0(1)
    // S.C = 0(1)
    static int countDigits(int n) {
        // Initialize a variable 'cnt' to
        // store the count of digits.

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        // Adding 1 to the result accounts
        // for the case when 'n' is a power of 10,
        // ensuring that the count is correct.

        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        // Return the count of digits in 'n'.
        return (int) Math.log10(n) + 1;
    }

    // T.C =  O(log10N + 1)
    // S.C = 0(1)
    static int countDigitsBrute(int n) {
        int cnt = 0;
        while (n > 0) {
            //int  rem = n % 10;
            n = n / 10;
            cnt++;
        }

        return cnt;
    }
}
