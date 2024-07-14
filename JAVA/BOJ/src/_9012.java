import java.io.*;
import java.util.*;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> stk = new Stack<>();
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stk.push('(');
                } else {
                    if (stk.empty()) {
                        stk.push(')');
                        break;
                    } else {
                        stk.pop();
                    }
                }
            }

            if (stk.isEmpty()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}