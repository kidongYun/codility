package com.example.springbootmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.stream.Collectors.toList;


@SpringBootTest
class SpringbootmongodbApplicationTests {

    @Test
    void contextLoads() {
        String S = "(()(())())";

        int result = solution(S);
        System.out.println(result);
    }

    public int solution(String S) {
        if("".equals(S)) {
            return 1;
        }

        Stack<String> stack = new Stack<>();

        for(int i=0; i<S.length(); i++) {
            if('(' == S.charAt(i)) {
                stack.push("(");
                continue;
            }

            if(!stack.empty()) {
                if("(".equals(stack.peek())) {
                    stack.pop();
                    continue;
                }
            }

            return 0;
        }

        if(stack.empty()) {
            return 1;
        }

        return 0;
    }
}