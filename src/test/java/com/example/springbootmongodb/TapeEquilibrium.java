package com.example.springbootmongodb;

import java.util.Arrays;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int right = Arrays.stream(A).sum();
        int left = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            int diff = Math.abs(left - right);

            if(minDiff > diff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
