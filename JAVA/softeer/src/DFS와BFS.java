import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {
    static int n,m,v;
    static int arr[][];
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i=0; i<m; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(v);
        sb.append("\n");
        visited = new boolean[n+1];
        bfs(v);

        System.out.println(sb);
    }

    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v+ " ");

        for(int i=0; i<n+1; i++) {
            if (arr[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    public static void bfs(int v) {
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            v = q.poll();
            sb.append(v + " ");

            for (int i=1; i<n+1; i++) {
                if(arr[v][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }

            }
        }
    }
}