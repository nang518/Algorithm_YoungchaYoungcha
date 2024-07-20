import java.io.*;
import java.util.*;

public class _10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push_front")) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }

            else if (command.equals("push_back")) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            }

            else if (command.equals("pop_front")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.removeFirst()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }

            else if (command.equals("pop_back")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.removeLast()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }

            else if (command.equals("size")) {
                sb.append(dq.size()).append('\n');
            }

            else if (command.equals("empty")) {
                if (!dq.isEmpty()) {
                    sb.append(0).append('\n');
                }

                else {
                    sb.append(1).append('\n');
                }
            }

            else if (command.equals("front")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.peek()).append('\n');
                }

                else {
                    sb.append(-1).append('\n');
                }
            }

            else if (command.equals("back")) {
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