import java.io.*;
import java.util.*;

public class _17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        boolean tag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '<') {
                tag = true;

                while (!stk.isEmpty()) {
                    sb.append(stk.pop());
                }

                sb.append(c);
            }

            else if (c == '>') {
                tag = false;
                sb.append(c);
            }

            else if (tag == true) {
                sb.append(c);
            }

            else if (tag == false) {
                if (c == ' ') {
                    while (!stk.isEmpty()) {
                        sb.append(stk.pop());
                    }

                    sb.append(c);
                }

                else {
                    stk.push(c);
                }
            }
        }

        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }

        System.out.println(sb);
    }
}
