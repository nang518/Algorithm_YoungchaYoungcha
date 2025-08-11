import java.io.*;
import java.util.*;

public class _1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        if (n != 0) st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (n == p && x <= arr[arr.length-1]) sb.append(-1).append('\n');
        else {
            int rank = 1;

            for (int i = 0; i < arr.length; i++) {
                if (x < arr[i]) rank++;
                else break;
            }

            sb.append(rank).append('\n');
        }

        System.out.println(sb);
    }
}
