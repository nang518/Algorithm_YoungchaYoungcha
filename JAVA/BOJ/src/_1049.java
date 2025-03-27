import java.io.*;
import java.util.*;

public class _1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] set = new int[m];
        int[] each = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            set[i] = Integer.parseInt(st.nextToken());
            each[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(set);
        Arrays.sort(each);

        int result = 0;

        while (n > 0) {
            int setPrice = set[0];
            int eachPrice = each[0];

            if (n < 6) {
                if (setPrice < eachPrice * n) {
                    result += setPrice;
                    break;
                } else {
                    result += eachPrice * n;
                    break;
                }
            }

            else {
                if (setPrice < eachPrice * 6) {
                    result += setPrice;
                } else {
                    result += eachPrice * 6;
                }

                n -= 6;
            }
        }

        System.out.println(result);
    }
}
