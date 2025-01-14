import java.io.*;
import java.util.*;

public class _2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int[] indegree = new int[n+1];
        int time[] = new int[n+1];
        int result[] = new int[n+1];

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            int pre = Integer.parseInt(st.nextToken());

            for (int k = 0; k < pre; k++) {
                int x = Integer.parseInt(st.nextToken());
                arr.get(x).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            result[i] = time[i];

            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int idx = q.poll();

            for (int i : arr.get(idx)) {
                result[i] = Math.max(result[i], result[idx] + time[i]);

                if (--indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, result[i]);
        }
        System.out.println(ans);
    }
}
