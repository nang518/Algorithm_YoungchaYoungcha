import java.io.*;
import java.util.*;

public class _1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }

        while (pq.size() > 1) {
            int x = pq.poll() + pq.poll();
            result += x;
            pq.offer(x);
        }

        result += pq.poll() + pq.poll();

        System.out.println(result);
    }
}
