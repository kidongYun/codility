package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int[] A = {10, 2, 5, 1, 8, 20};

        int result = solution(A);
        System.out.println(result);
    }

    public int solution(int[] A) {
        if(A.length == 0 || A.length == 1 || A.length == 2) {
            return 0;
        }

        Arrays.sort(A);

        for(int i=0; i<A.length-2; i++) {
            if(A[i] + A[i+1] > A[i+2]) {
                return 1;
            }
        }

        return 0;
    }
}