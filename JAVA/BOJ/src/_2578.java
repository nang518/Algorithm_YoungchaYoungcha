import java.io.*;
import java.util.*;

public class _2578 {
    static int[][] graph = new int[5][5];
    static int bingoCnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                cnt++;
                int target = Integer.parseInt(st.nextToken());

                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (target == graph[x][y]) graph[x][y] = 0;
                    }
                }

                hCheck();
                vCheck();
                lCheck();
                rCheck();

                if (bingoCnt >= 3) {
                    System.out.println(cnt);
                    return;
                }

                bingoCnt = 0;
            }

        }
    }

    static void hCheck() { //가로빙고
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (graph[i][j] == 0) cnt++;
            }

            if (cnt == 5) bingoCnt++;
        }
    }

    static void vCheck() { //세로빙고
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (graph[j][i] == 0) cnt++;
            }

            if (cnt == 5) bingoCnt++;
        }
    }

    static void lCheck() { //왼쪽대각선빙고
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (graph[i][i] == 0) cnt++;
        }

        if (cnt == 5) bingoCnt++;
    }

    static void rCheck() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (graph[i][4-i] == 0) cnt++;
        }

        if (cnt == 5) bingoCnt++;
    }
}
