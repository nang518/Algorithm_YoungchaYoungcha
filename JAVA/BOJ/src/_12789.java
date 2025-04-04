import java.io.*;
import java.util.*;

public class _12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        Stack<Integer> waiting = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == idx) idx++;
            else if (arr[i] != idx) waiting.push(arr[i]);

            while (true) {
                if (!waiting.isEmpty() && waiting.peek() == idx) {
                    waiting.pop();
                    idx++;
                }

                else break;
            }
        }

        if (waiting.isEmpty()) System.out.println("Nice");
        else System.out.println("Sad");

    }
}
