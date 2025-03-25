import java.io.*;
import java.util.*;

public class _11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') stk.push(c);
            else {
                if (stk.empty() || stk.peek() == ')') {
                    stk.push(c);
                    continue;
                }

                stk.pop();
            }
        }

        System.out.println(stk.size());
    }
}
