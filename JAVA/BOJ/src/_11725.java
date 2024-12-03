import java.io.*;
import java.util.*;

public class _11725 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        result = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < n+1; i++) {
            System.out.println(result[i]);
        }
    }

    static void dfs(int v) {
        visited[v] = true;

        for (int i : graph[v]) {
            if (!visited[i]) {
                result[i] = v;
                dfs(i);
            }
        }
    }
}
