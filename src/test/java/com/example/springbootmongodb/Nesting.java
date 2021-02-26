package com.example.springbootmongodb;

import java.util.Stack;

public class Nesting {
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
