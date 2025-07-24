import java.io.*;
import java.util.*;

public class _10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push_front")) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }

            else if (cmd.equals("push_back")) {
                dq.add(Integer.parseInt(st.nextToken()));
            }

            else if (cmd.equals("pop_front")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.removeFirst()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }

            else if (cmd.equals("pop_back")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.removeLast()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }

            else if (cmd.equals("size")) {
                sb.append(dq.size()).append('\n');
            }

            else if (cmd.equals("empty")) {
                if (dq.isEmpty()) {
                    sb.append(1).append('\n');
                }

                else {
                    sb.append(0).append('\n');
                }
            }

            else if (cmd.equals("front")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.peek()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }

            else if (cmd.equals("back")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.peekLast()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}