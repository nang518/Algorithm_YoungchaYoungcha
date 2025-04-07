import java.io.*;
import java.util.*;

public class _17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Stack<hw> stk = new Stack<>();
        int total = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());

            if (x == 1) {
                int score = Integer.parseInt(st.nextToken());
                int minute = Integer.parseInt(st.nextToken());

                if (minute == 1) total += score;
                else stk.push(new hw(score, minute-1));
            }

            else if (!stk.isEmpty()) {
                hw cur = stk.pop();
                cur.minute--;

                if (cur.minute == 0) total += cur.score;
                else stk.push(cur);
            }
        }

        System.out.println(total);
    }
}

class hw {
    int score;
    int minute;

    public hw(int score, int minute) {
        this.score = score;
        this.minute = minute;
    }
}
