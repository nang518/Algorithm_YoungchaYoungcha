import java.io.*;
import java.util.*;

public class _1835 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        dq.push(n);

        if (n == 1) {
            System.out.println(1);
            return;
        }

        else {
            dq.addFirst(n-1);

            while(true) {
                n--;

                for(int i = n; i > 0; i--) {
                    int last = dq.removeLast();
                    dq.addFirst(last);
                }

                if (n==1) break;
                dq.addFirst(n-1);
            }
        }

        while(dq.size() > 0) {
            System.out.print(dq.removeFirst() + " ");
        }
    }
}