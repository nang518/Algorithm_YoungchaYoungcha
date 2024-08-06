import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class _1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }

        for (int i = 0; i < n-1; i++) {
            int x = Integer.parseInt(br.readLine());

            pq.offer(x);
        }

        while (pq.peek() >= dasom) {
            int max = pq.poll();
            max--;
            dasom++;
            cnt++;
            pq.offer(max);
        }
        System.out.println(cnt);
    }
}
