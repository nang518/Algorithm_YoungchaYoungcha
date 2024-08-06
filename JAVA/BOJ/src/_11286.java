import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
           public int compare(Integer o1, Integer o2) {
               if (Math.abs(o1) == Math.abs(o2)) {
                   return o1 - o2;
               } else {
                   return Math.abs(o1) - Math.abs(o2);
               }
           }
        });
        
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.isEmpty()) {
                    sb.append('0');
                } else {
                    sb.append(pq.poll());
                }
                sb.append('\n');
            }

            else {
                pq.offer(x);
            }

        }
        System.out.println(sb);
    }
}
