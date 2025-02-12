import java.io.*;
import java.util.*;

public class _7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Integer[] a = new Integer[n];
            Integer[] b = new Integer[m];
            int result = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

//          1st
//            Arrays.sort(a);
//            Arrays.sort(b);

//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (a[i] > b[j]) {
//                        result++;
//                    }
//                }
//            }

//          2nd
//            Arrays.sort(a, Collections.reverseOrder());
//            Arrays.sort(b, Collections.reverseOrder());
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (a[i] > b[j]) {
//                        result += m - j;
//                        break;
//                    }
//                }
//            }

//          이분탐색
            Arrays.sort(b);
            for(int i = 0; i < n; i++) {
                int left = 0;
                int right = m-1;
                int cnt = 0;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (a[i] > b[mid]) {
                        left = mid + 1;
                        cnt = mid + 1;
                    }
                    else right = mid - 1;
                }
                result += cnt;
            }

            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
