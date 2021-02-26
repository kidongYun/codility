package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int[] A = {4, 1, 3};

        int result = solution(A);
        System.out.println(result);
    }

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