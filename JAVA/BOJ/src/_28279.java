import java.io.*;
import java.util.*;

public class _28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }

            else if (command == 2) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            }

            else if (command == 3) {
                if (dq.isEmpty()) sb.append(-1).append('\n');
                else sb.append(dq.removeFirst()).append('\n');
            }

            else if (command == 4) {
                if (dq.isEmpty()) sb.append(-1).append('\n');
                else sb.append(dq.removeLast()).append('\n');
            }

            else if (command == 5) {
                sb.append(dq.size()).append('\n');
            }

            else if (command == 6) {
                if (dq.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }

            else if (command == 7) {
                if (dq.isEmpty()) sb.append(-1).append('\n');
                else sb.append(dq.peekFirst()).append('\n');
            }

            else if (command == 8) {
                if (dq.isEmpty()) sb.append(-1).append('\n');
                else sb.append(dq.peekLast()).append('\n');
            }
        }
        System.out.println(sb);
    }
}