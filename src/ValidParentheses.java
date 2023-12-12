import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
         String s ="()[]{";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            Character ch = s.charAt(i);
            if(ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}'){
                continue;
            }
            if(ch == '(' || ch =='[' || ch == '{' ){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()) return false;
            switch (ch){
                case ')':
                  if(stack.pop() != '(') return false;
                  break;
                case ']':
                    if(stack.pop() != '[') return false;
                    break;
                case '}':
                    if(stack.pop() != '{') return false;
                    break;
            }
        }

        return stack.isEmpty();

    }
}
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */