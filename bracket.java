import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class bracket {

    private Object Maps;

    public static boolean isValid(String bracketString) {
        // .push() - returns item onto the stack
        // .pop() - returns the first item off the stack
        // const item = stack.pop(); == first item

        //this checks to see if the string is even if not string is not valid
        if (bracketString.length() % 2 != 0) {
            return false;
        }

        //adds each character to the stack FILO
        //N
        Stack<Character> stack = new Stack<Character>();
        for (char c : bracketString.toCharArray()) {
            stack.push(c);
        }

        //loop continues until the stack is empty or
        //returns false for a conditional statement
        //At most N
        while (!stack.isEmpty()) {
            char open = stack.pop();
            char close = stack.pop();

            //checks if the string ends with a left bracket
            if (open == '(' | open == '{' | open == '[') {
                return false;
            }

            //if ')' check if the next variable in the stack is ')' since FILO
            else if (open == 41) {
                if (close != (open - 1)) {
                    return false;
                }
            }

            //if ']' or '}' check if the next variable in the stack its left match
            //minus 2 since both ascii characters as 2 less for both these char
            else if (open == 93 || open == 125) {
                if (close != open - 2) {
                    return false;
                }
            }
        }
        //if the stack is empty and all if the conditional statements are false return true
        //time complexity = O(2n)
        return true;
    }

    public boolean validate(String str) {

        //create a hash map, key = open and value = close
        Map<Character, Character> brackets = new HashMap<>();
        //these are all constant time
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');

        //scroll through the string comparing to the next index for a proper close
        //N
        for (int i = 0; i < str.length() - 1; i += 2) {
            char open = str.charAt(i);
            char actual = str.charAt(i + 1);
            //proper close = the value from the Hash using open as the key
            char properClose = brackets.get(open);

            //if the actual bracket doesnt = the proper bracket reject
            if (actual != properClose) {
                return false;
            }
        }
        //time complexity = O(N)
        return true;
    }

    //this is just for testing the function
    public static void main(String[] args) {
        String str = "[][](){}";
        Boolean check = isValid(str);
        System.out.println(check);

    }
}


