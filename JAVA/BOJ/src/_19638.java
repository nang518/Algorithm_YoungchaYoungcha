import java.io.*;
import java.util.*;

public class _19638 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int senti = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        while (n-- > 0) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;

        if (pq.peek() < senti) {
            System.out.println("YES" + '\n' + 0);
            return;
        }

        while (t-- > 0) {
            if (pq.peek() != 1) pq.offer(pq.poll()/2);
            cnt++;

            if (pq.peek() < senti) {
                sb.append("YES").append("\n");
                sb.append(cnt);
                break;
            }
        }

        if (pq.peek() >= senti) {
            sb.append("NO").append('\n');
            sb.append(pq.peek());
        }

        System.out.println(sb);
    }
}
