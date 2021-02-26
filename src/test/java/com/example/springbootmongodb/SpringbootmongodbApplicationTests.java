package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int[] A = {0, 1, 0, 1, 1};

        int result = solution(A);
        System.out.println(result);
    }

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