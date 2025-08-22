import java.io.*;
import java.util.*;

public class _1961 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] arr90 = Rotation(arr);
            int[][] arr180 = Rotation(arr90);
            int[][] arr270 = Rotation(arr180);

            System.out.println("#" + idx);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr90[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr180[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr270[i][j]);
                }
                System.out.println();
            }
        }
    }

    static int[][] Rotation(int[][] arr) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[n-1-j][i];
            }
        }

        return result;
    }
}
