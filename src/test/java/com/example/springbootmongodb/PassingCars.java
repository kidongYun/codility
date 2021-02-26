package com.example.springbootmongodb;

public class PassingCars {
    public int solution(int[] A) {
        if (A.length == 1) return 0;

        int answer = 0;
        int globalSum = 0;
        int localSum = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] == 1) {
                answer += localSum + globalSum;
                globalSum += localSum;
                localSum = 0;

                if (answer > 1000000000) return -1;

                continue;
            }

            localSum++;
        }

        return answer;
    }
}
