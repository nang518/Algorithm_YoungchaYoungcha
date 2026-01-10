import java.io.*;
import java.util.*;

public class _23057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
            set.add(x);
            total += x;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                set.add(arr[i] + arr[j]);
            }
        }

        int cnt = 0;

        for (int i = 1; i < total; i++) {
            if (!set.contains(i)) cnt++;
        }

        System.out.println(cnt);
        System.out.println(set);
    }
}
