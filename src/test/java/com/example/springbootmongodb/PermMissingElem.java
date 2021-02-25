package com.example.springbootmongodb;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);

        if(A.length == 0) {
            return 1;
        }

        int prev = 0;
        for(int i=0; i<A.length; i++) {
            prev += 1;
            if(prev != A[i]) {
                return prev;
            }
        }

        return prev + 1;
    }
}
