import java.io.*;
import java.util.*;

public class _18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            
            if (cmd.equals("push")) q.offer(Integer.parseInt(st.nextToken()));

            else if (cmd.equals("pop")) {
                if (!q.isEmpty()) sb.append(q.poll()).append("\n");
                else sb.append(-1).append("\n");
            }

            else if (cmd.equals("size")) sb.append(q.size()).append("\n");

            else if (cmd.equals("empty")) {
                if (!q.isEmpty()) sb.append(0).append("\n");
                else sb.append(1).append("\n");
            }

            else if (cmd.equals("front")) {
                if (!q.isEmpty()) sb.append(q.peek()).append("\n");
                else sb.append(-1).append("\n");
            }

            else if (cmd.equals("back")) {
                if (!q.isEmpty()) sb.append(q.peekLast()).append("\n");
                else sb.append(-1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
