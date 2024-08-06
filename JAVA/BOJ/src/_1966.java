import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Queue<Integer> que = new LinkedList<>();
            Queue<Integer> index = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                que.offer(Integer.parseInt(st.nextToken()));
                index.offer(i);
            }

            int cnt = 1;

            while (!que.isEmpty()) {
                int max = Collections.max(que);
                int current = que.poll();
                int curIndex = index.poll();

                if (current == max) {
                    if (curIndex == m) {
                        sb.append(cnt + "\n");
                        break;
                    }

                    cnt++;
                }

                else {
                    que.offer(current);
                    index.offer(curIndex);
                }
            }
        }
        System.out.println(sb);
    }
}