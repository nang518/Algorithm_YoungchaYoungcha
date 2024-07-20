import java.io.*;
import java.util.*;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> que = new LinkedList<>();
        // 큐는 선입선출의 개념으로, 맨 앞에 있는 값만 pop할 수 있다.
        // 맨 마지막 원소 (즉, 가장 마지막으로 들어간 원소)를 찾는 경우를 위해 push 할 때, 변수를 설정하여 값을 저장함. (num)
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int num = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                que.add(num);

            }

            else if (command.equals("pop")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(que.poll()).append("\n");
                }
            }

            else if (command.equals("size")) {
                sb.append(que.size()).append('\n');
            }

            else if (command.equals("empty")) {
                if (que.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            }

            else if (command.equals("front")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(que.peek()).append('\n');
                }
            }

            else if (command.equals("back")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(num).append('\n');
                }
            }

        }
        System.out.println(sb);
    }
}