package edu.kit.informatik;

/**
 * This class describes estimates Euler's number e and determines if a natural
 * positive number n is a prime number.
 *
 * @author uogok
 *
 * @version 1.0
 */
public final class MathTools {

    private MathTools() {
        throw new AssertionError("Utility Classes must not be instantiated!");
    }

    private static long factorial(int k) { // calculates k!

        long f = 1;

        if (k > 0) {
            
            for (int i = 1; i <= k; i++) {

                f = f * i;

            }
            return f;

        }
        return f;

    }

    /**
     * Estimates Euler's number e.
     *
     * @param n The higher the number n, the more precise e becomes
     * @return returns an estimation of the Euler's number e
     * 
     * @author uogok
     * 
     * @version 2.0
     */
    public static double euler(int n) {

        double e = 0;

        for (int k = 0; k <= n; k++) {

            e = e + (1 / (double) factorial(k));

        }
        return e;
    }
    
    public static void main(String args[]) {
        
        System.out.println(euler(100));
        
    }

    /**
     * Determines if a natural positive number n is a prime number.
     *
     * @param n is the input and we have to check if it is a prime
     * @return returns true if the number n is a prime, false if the number is not
     *         prime
     */
    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                return false;

            }

        }
        return true;
    }

}
