import java.io.*;
import java.util.*;

public class _14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        int cnt = 0;

        for (int i = 1; i < 11; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            if (arr[cow] == -1) {
                arr[cow] = location;
            }
            else {
                if (arr[cow] != location) {
                    cnt++;
                    arr[cow] = location;
                }
            }
        }

        System.out.println(cnt);
    }
}
