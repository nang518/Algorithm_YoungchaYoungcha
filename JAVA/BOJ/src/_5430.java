import java.io.*;
import java.util.*;

public class _5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            Deque<Integer> dq = new ArrayDeque<>();

            if (n == 0) {
                if (s.contains("D")) System.out.println("error");
                else System.out.println("[]");
                continue;
            }

            for (int i = 1; i < input.length(); i++) { //항상 일의 자리의 숫자만 입력되는 것이 아님.
                StringBuilder num = new StringBuilder();

                while (input.charAt(i) != ',' && input.charAt(i) != ']') {
                    num.append(input.charAt(i));
                    i++;
                }

                dq.offer(Integer.parseInt(num.toString()));
            }

            boolean reverse = false;
            boolean error = false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == 'R') reverse = !reverse;
                else {
                    if (dq.isEmpty()) {
                        error = true;
                        continue;
                    }

                    if (reverse) dq.removeLast();
                    else dq.removeFirst();
                }
            }

            if (error) sb.append("error");
            else {
                sb.append('[');

                if (reverse) {
                    while (!dq.isEmpty()) {
                        if (dq.size() == 1) {
                            sb.append(dq.removeLast());
                            continue;
                        }

                        sb.append(dq.removeLast()).append(',');
                    }
                }

                else {
                    while (!dq.isEmpty()) {
                        if (dq.size() == 1) {
                            sb.append(dq.removeFirst());
                            continue;
                        }

                        sb.append(dq.removeFirst()).append(',');
                    }
                }

                sb.append(']');
            }

            System.out.println(sb);
        }

    }
}
