package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int K = 4;
        int[] A = {1, 2, 3, 4, 1, 1, 3};

        int result = solution(K, A);
        System.out.println(result);
    }

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