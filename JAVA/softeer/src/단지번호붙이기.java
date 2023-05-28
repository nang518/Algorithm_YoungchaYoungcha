import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단지번호붙이기 {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int n, cnt=0;
    static int[] arr = new int[25];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i=0; i<n; i++) {
            String st = br.readLine();
            for (int j=0; j<n; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(st.charAt(j)));
            }
        }

        arr = new int[5];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j] != 0 && !visited[i][j]) {
                    cnt++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(arr);
        System.out.println(cnt);

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0)
                continue;
            else {
                System.out.println(arr[i]);
            }
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        arr[cnt]++;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0<=nx && nx<n && 0<=ny && ny<n) {
                if (graph[nx][ny] != 0 && !visited[nx][ny]) {
                    dfs(nx,ny);
                }
            }
        }
    }
}