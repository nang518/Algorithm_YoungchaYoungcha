import java.io.*;
import java.util.*;

public class _1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            que.add(i);
        }

        sb.append("<");

        while (que.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                que.add(que.poll());
            }

            sb.append(que.poll() + ", ");
        }

        sb.append(que.poll() + ">");

        System.out.println(sb);
    }
}