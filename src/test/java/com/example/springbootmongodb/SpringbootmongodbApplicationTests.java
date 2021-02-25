package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int[] A = new int[] {3, 1, 2, 4, 3};

        int result = solution(A);
        System.out.println(result);
    }

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