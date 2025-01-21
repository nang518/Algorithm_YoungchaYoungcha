import java.io.*;
import java.util.*;

public class _24445 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        bfs(r);

        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        int cnt = 1;
        result[x] = cnt;

        while (!q.isEmpty()) {
            int idx = q.poll();

            for (int i : graph.get(idx)) {
                if (!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    cnt++;
                    result[i] = cnt;
                }
            }
        }

    }
}
