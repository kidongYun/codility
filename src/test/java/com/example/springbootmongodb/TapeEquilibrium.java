package com.example.springbootmongodb;

import java.util.Arrays;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int total = Arrays.stream(A).sum();
        int left = 0;
        int prevDiff = total;

        for(int i=0; i<A.length; i++) {
            left += A[i];
            int right = total - left;
            int diff = Math.abs(left - right);

            if(prevDiff < diff) {
                return prevDiff;
            }

            prevDiff = diff;
        }

        return prevDiff;
    }
}
