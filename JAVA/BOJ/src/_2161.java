import java.io.*;
import java.util.*;

public class _2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        while (true) {
            sb.append(deque.removeFirst() + " ");
            if (deque.size() >= 1) deque.add(deque.removeFirst());

            if (deque.size() == 0) break;
        }

        System.out.println(sb);

    }
}
