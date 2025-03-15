import java.io.*;
import java.util.*;

public class _14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());

            if (x == 0) {
                if (pq.isEmpty()) sb.append(-1).append('\n');
                else sb.append(pq.poll()).append('\n');
            }

            else {
                for (int i = 0; i < x; i++) {
                    int value = Integer.parseInt(st.nextToken());
                    pq.offer(value);
                }
            }
        }

        System.out.println(sb);
    }
}
