import java.io.*;
import java.util.*;

public class _5464 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] current = new int[n+1];
        int[] r = new int[n+1];
        int[] w = new int[m+1];
        Queue<Integer> que = new LinkedList<>();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            r[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= m; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }

        outer: for (int i = 0; i < 2*m; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x > 0) {
                for (int j = 1; j <= n; j++) {
                    if (current[j] == 0) {
                        current[j] = x;
                        continue outer;
                    }
                }

                que.offer(x);
            }

            else {
                for (int j = 1; j <= n; j++) {
                    if (current[j] == -(x)) {
                        result += r[j] * w[-x];
                        current[j] = 0;

                        if (!que.isEmpty()) current[j] = que.poll();
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
