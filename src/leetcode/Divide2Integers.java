package leetcode;

public class Divide2Integers {//completed
    public static void main(String[] args){
        int a = -2147483648, b = -1;//2147483648
        System.out.println(divide(a, b));

    }
    static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // 2^31 - 1
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to handle edge cases with overflow (Integer.MIN_VALUE)
        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract divisorLong from dividendLong until dividendLong becomes less than divisorLong
        while (dividendLong >= divisorLong) {
            long tempDivisor = divisorLong, multiple = 1;
            // Try to subtract larger chunks by shifting bits (doubling the divisor)
            while (dividendLong >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            // Subtract the largest chunk possible
            dividendLong -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign
        quotient = negative ? -quotient : quotient;

        return quotient;
    }
}
