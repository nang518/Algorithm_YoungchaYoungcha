import java.io.*;
import java.util.*;

public class _6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();

        long cnt = 0;

        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(br.readLine());

            while (!stk.empty()) {
                if (stk.peek() <= h) stk.pop();
                else break;
            }

            cnt += stk.size();
            stk.push(h);
        }

        System.out.println(cnt);
    }
}
