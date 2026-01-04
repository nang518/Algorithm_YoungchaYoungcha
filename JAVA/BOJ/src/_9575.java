import java.io.*;
import java.util.*;

public class _9575 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                a.add(Integer.parseInt(st.nextToken()));
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                b.add(Integer.parseInt(st.nextToken()));
            }

            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                c.add(Integer.parseInt(st.nextToken()));
            }

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int x = a.get(i);
                for (int j = 0; j < m; j++) {
                    int y = b.get(j);
                    for (int l = 0; l < k; l++) {
                        int z = c.get(l);

                        int total = x + y + z;

                        if (check(total)) {
                            set.add(total);
                        }
                    }
                }
            }

            System.out.println(set.size());
        }
    }

    static boolean check (int n) {
        while (n > 0) {
            int digit = n%10;

            if (digit != 5 && digit != 8) return false;
            n /= 10;
        }

        return true;
    }
}
