import java.io.*;
import java.util.*;

public class _1516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr[] = new ArrayList[n+1];
        int[] cost = new int[n+1];
        int[] indegree = new int[n+1];
        int[] result = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            cost[i] = Integer.parseInt(st.nextToken());

            while (st.hasMoreTokens()) {
                int pre = Integer.parseInt(st.nextToken());

                if (pre == -1) break;

                indegree[i]++;
                arr[pre].add(i);
            }
        }

        Queue<Integer> pq = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                pq.offer(i);
                result[i] = cost[i];
            }
        }

        while (!pq.isEmpty()) {
            int idx = pq.poll();

            for (int i : arr[idx]) {
                result[i] = Math.max(result[i], result[idx] + cost[i]);
                if (--indegree[i] == 0) pq.offer(i);
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }
}
