import java.io.*;
import java.util.*;

public class _24511_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] structureList = new int[n];
        int[] current = new int[n];
        int[] insert = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            structureList[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            current[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            insert[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (structureList[i] == 0) {
                dq.addFirst(current[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            dq.add(insert[i]);
            sb.append(dq.pollFirst() + " ");
        }

        System.out.println(sb);
    }
}
