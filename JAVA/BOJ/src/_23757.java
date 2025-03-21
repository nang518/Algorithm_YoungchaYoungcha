import java.io.*;
import java.util.*;

public class _23757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int w = Integer.parseInt(st.nextToken());

            int present = pq.poll() - w;

            if (present < 0) {
                System.out.println(0);
                return;
            }

            if (present != 0) pq.offer(present);
        }

        System.out.println(1);
    }
}
