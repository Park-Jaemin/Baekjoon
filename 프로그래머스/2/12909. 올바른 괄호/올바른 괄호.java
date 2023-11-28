import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            
            if (bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}