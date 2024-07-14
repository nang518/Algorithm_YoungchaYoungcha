import java.io.*;
import java.util.*;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                stk.push(n);
            } else {
                stk.pop();
            }
        }

        for (int i : stk) {
            sum += i;
        }

        System.out.println(sum);
    }
}