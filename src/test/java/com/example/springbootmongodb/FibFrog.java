package com.example.springbootmongodb;

import java.util.ArrayList;
import java.util.List;

public class FibFrog {
    public int solution(int[] A) {
        if(A.length == 0 || A.length == 1 || A.length == 2) return 1;

        List<Integer> fibos = new ArrayList<>();
        fibos.add(0);
        fibos.add(1);
        while(fibos.get(fibos.size()-1) < 100000) {
            fibos.add(fibos.get(fibos.size()-2) + fibos.get(fibos.size()-1));
        }
        fibos.remove(fibos.size() - 1);

        List<Integer> spots = new ArrayList<>();

        for(int i=0; i<A.length; i++) {
            if(A[i] == 1) {
                spots.add(i);
            }
        }
        spots.add(A.length);

        int answer = 0;
        int src = -1;
        int dest = A.length;

        while(src != dest) {
            boolean impossible = true;

            for(int i=spots.size()-1; i>=0; i--) {
                if(fibos.contains(spots.get(i) - src)) {
                    src = spots.get(i);
                    answer++;
                    impossible = false;
                    break;
                }
            }

            if(impossible){
                return -1;
            }
        }

        return answer;
    }
}
