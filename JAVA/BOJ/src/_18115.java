import java.io.*;
import java.util.*;

public class _18115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());

        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (x == 1) {
                dq.addFirst(i);
            }

            else if (x == 2) {
                int tmp = dq.removeFirst();
                dq.addFirst(i);
                dq.addFirst(tmp);
            }

            else {
                dq.addLast(i);
            }
        }

        while (true) {
            if (dq.isEmpty()) break;
            sb.append(dq.remove() + " ");
        }

        System.out.println(sb);

    }
}
