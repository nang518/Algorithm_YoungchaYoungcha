import java.io.*;
import java.util.*;

public class _2623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int[] indegree = new int[n+1];

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int pre = Integer.parseInt(st.nextToken());

            for (int j = 0; j < num - 1; j++) {
                int singer = Integer.parseInt(st.nextToken());
                arr.get(pre).add(singer);
                indegree[singer]++;
                pre = singer;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int idx = q.poll();
            result.add(idx);

            for (int i : arr.get(idx)) {
                if (--indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        if (result.size() != n) sb.append("0\n");
        else {
            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i) + "\n");
            }
        }
        System.out.println(sb);
    }
}
