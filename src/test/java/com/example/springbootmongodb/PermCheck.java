package com.example.springbootmongodb;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        if(A.length == 0) return 0;
        if(A.length == 1) {
            return (A[0] == 1) ? 1 : 0;
        }

        Arrays.sort(A);
        int prev = 1;

        for(int i=1; i<A.length; i++) {
            if(++prev != A[i]) {
                return 0;
            }
        }

        return 1;
    }
}
