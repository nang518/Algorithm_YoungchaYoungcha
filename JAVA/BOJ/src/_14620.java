import java.io.*;
import java.util.*;

public class _14620 {
    static int[][] graph;
    static boolean[][] visited;
    static int n;
    static int result = Integer.MAX_VALUE;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(result);
    }

    static void dfs(int cnt, int sum) {
        if (sum >= result) return;

        if (cnt == 3) {
            result = Math.min(result, sum);
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (!visited[i][j] && checkVisit(i, j)) {
                    visited[i][j] = true;
                    int cost = costSum(i, j);
                    dfs(cnt + 1, sum + cost);
                    visitClear(i,j);
                }
            }
        }
    }

    static boolean checkVisit(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (visited[nx][ny]) return false;
        }

        return true;
    }

    static int costSum(int x, int y) {
        int cost = graph[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            cost += graph[nx][ny];
            visited[nx][ny] = true;
        }

        return cost;
    }

    static void visitClear(int x, int y) {
        visited[x][y] = false;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            visited[nx][ny] = false;
        }
    }
}