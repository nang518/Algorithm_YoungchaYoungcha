import java.io.*;
import java.util.*;

public class _13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            PriorityQueue<Long> pq = new PriorityQueue<>();
            long result = 0;

            int k = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            while(k-- > 0) {
                pq.offer(Long.parseLong(st.nextToken()));
            }

            while (pq.size() > 1) {
                long x = pq.poll() + pq.poll();
                pq.offer(x);
                result += x;
            }

            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
