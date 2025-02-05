import java.io.*;
import java.util.*;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Stack<Character> stk =  new Stack<>();
            String s = br.readLine();

            if (s.equals(".")) break;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '[' || c == '(') {
                    stk.push(c);
                }

                else if (c == ']') {
                    if (!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                    }

                    else stk.push(c);
                }

                else if (c == ')') {
                    if (!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    }

                    else stk.push(c);
                }
            }

            if (stk.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
