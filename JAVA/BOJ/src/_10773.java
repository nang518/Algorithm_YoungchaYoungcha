import java.io.*;
import java.util.*;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stk =  new Stack<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                stk.pop();
            } else {
                stk.push(n);
            }
        }

        for (int val : stk) {
            sum += val;
        }

        System.out.println(sum);
    }
}