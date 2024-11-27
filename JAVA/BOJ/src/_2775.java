import java.io.*;

public class _2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[k+1][n+1];

            for (int i = 0; i < n+1; i++) {
                arr[0][i] = i;
            }

            for (int i = 1; i < k+1; i++) {
                for (int j = 1; j < n+1; j++) {
                    for (int x = 1; x < j+1; x++) {
                        arr[i][j] += arr[i-1][x];
                    }
                }
            }
            System.out.println(arr[k][n]);
        }
    }
}
