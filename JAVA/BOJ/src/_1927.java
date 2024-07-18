import java.io.*;
import java.util.*;

public class _1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                sb.append(pq.isEmpty() ? "0" : pq.poll());
                sb.append('\n');
            } else {
                pq.add(x);
            }
        }

        System.out.println(sb);
    }
}
