public class Solution {
    public Boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('/');
        int count = s.length();
        int i = 0;
        
        while (i < count)
        {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if(ch == ')' && stack.peek() == '(' || ch == '}' && stack.peek() == '{' || ch == ']' && stack.peek() == '[')
                stack.pop();
            else return false;
            
            i++;
        }
        
        if (stack.peek() == '/') return true;
        
        return false;
    }
}