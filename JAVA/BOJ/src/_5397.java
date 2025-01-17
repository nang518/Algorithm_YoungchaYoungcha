import java.io.*;
import java.util.*;

public class _5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            Stack<Character> resultStk = new Stack<>();
            Stack<Character> tmpStk = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '<') {
                    if (!resultStk.isEmpty()) {
                        tmpStk.push(resultStk.pop());
                    }
                }

                else if (c == '>') {
                    if (!tmpStk.isEmpty()) {
                        resultStk.push(tmpStk.pop());
                    }
                }

                else if (c == '-') {
                    if (!resultStk.isEmpty()) {
                        resultStk.pop();
                    }
                }

                else {
                    resultStk.push(c);
                }
            }

            while (!tmpStk.isEmpty()) {
                resultStk.push(tmpStk.pop());
            }

            for (int i = 0; i < resultStk.size(); i++) {
                sb.append(resultStk.get(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
