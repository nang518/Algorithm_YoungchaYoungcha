import java.io.*;
import java.util.*;

public class _10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] weather = new int[h][w];

        for (int i = 0; i < h; i++) {
            String s = br.readLine();
            int cloud = -1;

            for (int j = 0; j < w; j++) {
                weather[i][j] = s.charAt(j);

                if (weather[i][j] == 'c') {
                    cloud = 0;
                    sb.append(0 + " ");
                }

                else {
                    if (cloud == -1) {
                        sb.append(-1 + " ");
                    } else {
                        cloud++;
                        sb.append(cloud + " ");
                    }
                }
            }
            sb.append('\n');

        }
        System.out.println(sb);

    }
}
