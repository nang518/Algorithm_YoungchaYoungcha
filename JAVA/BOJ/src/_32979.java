import java.io.*;
import java.util.*;

public class _32979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 2 * n; i++) {
            dq.add(Integer.parseInt(st.nextToken()));
        }

        int[] b = new int[t];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < t; i++) {
            int target = b[i];

            for (int j = 1; j < target; j++) {
                dq.add(dq.removeFirst());
            }

            sb.append(dq.peek() + " ");
        }

        System.out.println(sb);
    }
}
