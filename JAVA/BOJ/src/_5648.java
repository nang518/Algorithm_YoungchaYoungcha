import java.io.*;
import java.util.*;

public class _5648 {
    static class ReverseNum {
        public long reverseNum(long n) {
            long reversed = 0;

            while (n > 0) {
                reversed = reversed * 10 + n % 10;
                n /= 10;
            }
            return reversed;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ReverseNum r = new ReverseNum();
        ArrayList<Long> arr = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (true) {
            while (st.hasMoreTokens()) {
                arr.add(r.reverseNum(Long.parseLong(st.nextToken())));
                ++cnt;
            }

            if (cnt == n) break;
            st = new StringTokenizer(br.readLine());
        }

        Collections.sort(arr);

        for (long num : arr) {
            System.out.println(num);
        }
    }
}
