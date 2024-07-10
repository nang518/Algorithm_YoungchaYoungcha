import java.io.*;
import java.util.*;

public class _27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[4];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String fruit = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (fruit.equals("STRAWBERRY")) arr[0] += num;
            else if (fruit.equals("BANANA")) arr[1] += num;
            else if (fruit.equals("LIME")) arr[2] += num;
            else arr[3] += num;
        }

        String ans = "NO";

        for (int i = 0; i < 4; i++) {
            if (arr[i] == 5) {
                ans = "YES";
            }
        }

        System.out.println(ans);
    }
}