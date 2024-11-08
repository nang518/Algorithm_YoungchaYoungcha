import java.io.*;
import java.util.*;

public class _29813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, Integer> map = new HashMap<>();
        Queue<String> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            map.put(s, num);
            que.add(s);
        }

        while (que.size() > 1) {
            String s = que.poll();
            int find = map.get(s);

            for (int i = 0; i < find-1; i++) {
                que.add(que.poll());
            }
            que.poll();
        }

        System.out.println(que.poll());
    }
}
