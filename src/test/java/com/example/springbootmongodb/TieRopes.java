package com.example.springbootmongodb;

public class TieRopes {
    public int solution(int K, int[] A) {
        int count = 0;
        int sum = 0;

        for(int i=0; i<A.length; i++) {
            sum += A[i];

            if(sum >= K) {
                sum = 0;
                count++;
            }
        }

        return count;
    }
}
