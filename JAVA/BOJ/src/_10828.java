import java.io.*;
import java.util.*;

public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                stk.push(Integer.parseInt(st.nextToken()));
            }

            else if (str.equals("pop")) {
                if (stk.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stk.pop() + "\n");
                }
            }

            else if (str.equals("size")) {
                sb.append(stk.size() + "\n");
            }

            else if (str.equals("empty")) {
                if (stk.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            }

            else if (str.equals("top")) {
                if (stk.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stk.peek() + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}