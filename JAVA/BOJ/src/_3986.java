import java.io.*;
import java.util.*;

public class _3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stk = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            stk = new Stack<>();

            for (int j = 0; j < s.length(); j++) {
                if (stk.size() > 0 && stk.peek() == s.charAt(j)) {
                    stk.pop();
                }

                else {
                    stk.push(s.charAt(j));
                }
            }

            if (stk.isEmpty()) cnt++;
        }

        System.out.println(cnt);
    }
}
