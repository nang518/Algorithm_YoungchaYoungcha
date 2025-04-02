import java.io.*;
import java.util.*;

public class _28107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer>[] orders = new ArrayDeque[200001];
        int[] result = new int[n];

        for (int i = 0; i < 200001; i++) {
            orders[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());

            while (k-- > 0) {
                int x = Integer.parseInt(st.nextToken());

                orders[x].add(i);
            }
        }

        st = new StringTokenizer(br.readLine());

        while (m-- > 0) {
            int sushi = Integer.parseInt(st.nextToken());

            if (!orders[sushi].isEmpty()) {
                int ans = orders[sushi].pollFirst();
                result[ans] += 1;
            }
        }

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
