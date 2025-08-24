import java.io.*;
import java.util.*;

public class _4108 {
    static int r,c;
    static char[][] map;
    static int[] dx = {-1,1,0,0,-1,-1,1,1};
    static int[] dy = {0,0,1,-1,-1,1,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (r == 0 && c == 0) {
                System.out.println(sb);
                break;
            }

            map = new char[r][c];

            for (int i = 0; i < r; i++) {
                String s = br.readLine();

                for (int j = 0; j < c; j++) {
                    map[i][j] = s.charAt(j);
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (map[i][j] == '*') {
                        sb.append(map[i][j]);
                    }

                    else {
                        sb.append(find(i,j));
                    }
                }
                sb.append('\n');
            }
        }
    }

    static int find(int x, int y) {
        int cnt = 0;

        for (int i = 0; i< 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                if (map[nx][ny] == '*') cnt++;
            }
        }

        return cnt;
    }
}
