import java.io.*;
import java.util.*;

public class _24444 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        bfs(r);

        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        int cnt = 1;
        result[v] = cnt;

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
