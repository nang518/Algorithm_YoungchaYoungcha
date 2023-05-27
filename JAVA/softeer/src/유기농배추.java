import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 유기농배추 {
    static int m,n,k;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int p=0; p<t; p++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cnt = 0;
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            graph = new int[m][n];
            visited = new boolean[m][n];

            for (int i=0; i<k; i++) {
                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x][y] = 1;
            }

            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        bfs(i,j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    public static void bfs(int x, int y) {
        Queue<int []> que = new LinkedList<>();
        que.add(new int[] {x,y});

        while (!que.isEmpty()) {
            x = que.peek()[0];
            y = que.peek()[1];

            visited[x][y] = true;
            que.poll();

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < m && 0 <= ny && ny < n) {
                    if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                        que.add(new int[] {nx,ny});
                        visited[nx][ny] = true;
                    }
                }
            }

        }
    }
}