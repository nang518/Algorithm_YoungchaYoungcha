import java.io.*;
import java.util.*;

public class _2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int maxSum = 0;

            for (int i = 0; i < n-m+1; i++) {
                for (int j = 0; j < n-m+1; j++) {
                    int sum = 0;
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < m; l++) {
                            sum += arr[i+k][j+l];
                        }
                    }

                    if (sum > maxSum) maxSum = sum;
                }
            }

            sb.append("#" + idx + " " + maxSum + "\n");
        }
        System.out.println(sb);
    }
}
