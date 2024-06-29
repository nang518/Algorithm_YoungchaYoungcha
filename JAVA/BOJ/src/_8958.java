import java.io.*;
import java.util.*;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String arr[] = new String[t];

        for (int i = 0; i < t; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < t; i++) {
            int cnt = 0, sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                }

                else {
                    cnt = 0;
                }

                sum += cnt;
            }

            System.out.println(sum);
        }
    }
}
