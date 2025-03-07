import java.io.*;
import java.util.*;

public class _1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();


        int idx = 0;

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());

             if (x > idx) {
                 for (int i = idx+1; i <= x; i++) {
                     stk.push(i);
                     sb.append('+').append('\n');
                 }

                 idx = x;
             }

             else if (stk.peek() != x) {
                 System.out.println("NO");
                 return;
             }

             stk.pop();
             sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
