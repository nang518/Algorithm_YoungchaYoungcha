import java.io.*;
import java.util.*;

public class _31860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int today = 0, yesterday = 0;
        int cnt = 0;

        while (pq.size() != 0) {
            if (pq.peek() <= k) {
                pq.poll();
            }

            int work = pq.poll();
            if (work - m > k) pq.offer(work-m);

            today = yesterday / 2 + work;
            yesterday = today;

            sb.append(today).append("\n");
            cnt++;
        }

        System.out.println(cnt);
        System.out.println(sb);

    }
}
