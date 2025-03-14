import java.io.*;
import java.util.*;

public class _28066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        if (n < k) {
            sb.append(dq.peek());
        }

        while (n >= k) {
            dq.add(dq.removeFirst());

            for (int i = 0; i < k-1; i++) {
                dq.removeFirst();
                n--;
            }

            if (n < k) {
                System.out.println(dq.peek());
            }
        }

        System.out.println(sb);
    }
}
