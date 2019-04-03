package com.codegym.prime;

public class ShowPrimeNumbers {
    public static void main(String[] args) {
        for (int j = 1; j <= 100; j++) {
            if (checkPrime(j)) {
                System.out.print(j + "\t");
            }
        }

    }

    private static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;

    }
}
