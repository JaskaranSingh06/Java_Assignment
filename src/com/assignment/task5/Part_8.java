package com.assignment.task5;

import java.util.Stack;

public class Part_8 {
    public static void main(String[] args) {
        String input = "[()]{}{[()()]()}";
        String input2 = "{{([)]}}";
        boolean isBalanced = checkBalancedBraces(input);

        if (isBalanced)
            System.out.println("String contains balanced braces");
        else
            System.out.println("String contains unbalanced braces");
    }

    public static boolean checkBalancedBraces(String inputString) {
        Stack<Character> stack = new Stack<>();

        if(inputString.length() % 2 == 1)
            return false ;

        for (char ch : inputString.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced braces
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Unbalanced braces
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, braces are balanced
    }
}
