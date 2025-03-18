import java.io.*;
import java.util.*;

public class _18352 {
    static int n,m,k,x;
    static List<List<Integer>> graph;
    static int[] distance;
    static boolean[] visited;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        result = new ArrayList<>();
        distance = new int[n+1];
        visited = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }

        bfs(x);

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result);
            for (int i : result) System.out.println(i);
        }
    }

    static void bfs(int v) {
        Queue<Integer> que = new LinkedList<>();
        que.add(v);
        visited[v] = true;

        while (!que.isEmpty()) {
            int cur = que.poll();

            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[cur] + 1;
                    que.add(next);

                    if (distance[next] == k) result.add(next);
                }
            }
        }

    }

}
