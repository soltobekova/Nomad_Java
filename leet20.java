package leetcode_20;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string of brackets: ");
        String s = scanner.nextLine(); 
        boolean isValid = isValid(s); 
        System.out.println(isValid); 
        scanner.close();
    }

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()]; 
        int top = -1; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 

            if (ch == '(' || ch == '{' || ch == '[') {
                top++; 
                stack[top] = ch; 
            } 
            
            else { 
                if (top == -1) {
                    return false;
                }
                
                char topChar = stack[top]; 
                top--;

                if ((ch == ')' && topChar != '(') || 
                    (ch == '}' && topChar != '{') || 
                    (ch == ']' && topChar != '[')) {
                    return false; 
                }
            }
        }

        return top == -1; 
    }
}
