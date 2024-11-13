import java.io.*;
import java.util.*;

public class _1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = 10;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];

            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int maxSum = -1;
            int dSum1 = 0, dSum2 = 0;

            for (int i = 0; i < 100; i++) {
                int rSum = 0, cSum = 0;

                for (int j = 0; j < 100; j++) {
                    rSum += arr[i][j];
                    cSum += arr[j][i];
                }
                maxSum = Math.max(maxSum, Math.max(rSum, cSum));

                dSum1 += arr[i][i];
                dSum2 += arr[i][99-i];
            }
            maxSum = Math.max(maxSum, Math.max(dSum1, dSum2));

            sb.append("#" + n + " " + maxSum + "\n");
        }
        System.out.println(sb);
    }
}
