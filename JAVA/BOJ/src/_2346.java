import java.io.*;
import java.util.*;

public class _2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = dq.removeFirst();
        sb.append(x + " ");
        boolean reverse = false;

        while (dq.size() != 1) {
            int move = arr[x];

            if (move < 0) {
                for (int i = 0; i < -(move)-1; i++) {
                    dq.addFirst(dq.removeLast());
                }

                x = dq.removeLast();
                sb.append(x + " ");
            }

            else {
                for (int i = 0; i < move-1; i++) {
                    dq.add(dq.removeFirst());
                }

                x = dq.removeFirst();
                sb.append(x + " ");
            }
        }

        sb.append(dq.remove());

        System.out.println(sb);
    }
}
