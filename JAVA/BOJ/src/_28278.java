import java.io.*;
import java.util.*;

public class _28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                stk.push(Integer.parseInt(st.nextToken()));
            }

            else if (command == 2) {
                if (!stk.isEmpty()) sb.append(stk.pop()).append('\n');
                else sb.append(-1).append('\n');
            }

            else if (command == 3) {
                sb.append(stk.size()).append('\n');
            }

            else if (command == 4) {
                if (stk.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }

            else if (command == 5) {
                if (!stk.isEmpty()) sb.append(stk.peek()).append('\n');
                else sb.append(-1).append('\n');
            }
        }

        System.out.println(sb);
    }
}
