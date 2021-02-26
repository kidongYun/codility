package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        int N = 10;
        int M = 4;

        int result = solution(N, M);
        System.out.println(result);
    }

    public int solution(int N, int M) {
        return N / gcd(N, M);
    }

    public int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }
}