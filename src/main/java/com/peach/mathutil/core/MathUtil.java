package com.peach.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }

        long result = 1;

        //n đang ổn, làm vòng for mà tính dồn, nhân dồn vào result
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}