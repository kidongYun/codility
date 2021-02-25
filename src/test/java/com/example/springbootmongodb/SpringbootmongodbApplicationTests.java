package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

        int result = solution(X, A);
        System.out.println(result);
    }

    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<A.length; i++) {
            set.add(A[i]);

            if(set.size() == X) {
                return i;
            }
        }

        return -1;
    }
}