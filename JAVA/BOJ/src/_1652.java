import java.io.*;

public class _1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        int h_cnt = 0, v_cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0 ; i < n; i++) {
            int h_check = 0, v_check = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '.') h_check++;
                if (arr[i][j] == 'X' || j == n - 1) {
                    if (h_check >= 2) h_cnt++;
                    h_check = 0;
                }

                if (arr[j][i] == '.') v_check++;
                if (arr[j][i] == 'X' || j == n - 1) {
                    if (v_check >= 2) v_cnt++;
                    v_check = 0;
                }
            }
        }

        System.out.println(h_cnt + " " + v_cnt);
    }
}