import java.io.*;
import java.util.*;

public class _1388 {
    static int[][] graph;
    static boolean[][] visited;
    static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) continue;
                if (graph[i][j] == '-') dfs(i,j,true);
                else dfs(i,j,false);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void dfs(int x, int y, boolean row) {
        visited[x][y] = true;

        if (row) {
            y++;
            if (y < m && graph[x][y] == '-') dfs(x, y, true);
        }

        else {
            x++;
            if (x < n && graph[x][y] == '|') dfs(x, y, false);
        }

    }
}
