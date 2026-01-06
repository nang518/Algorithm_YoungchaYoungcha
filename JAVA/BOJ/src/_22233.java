import java.io.*;
import java.util.*;

public class _22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        while (n-- > 0) {
            String s = br.readLine();
            set.add(s);
        }

        while (m-- > 0) {
            String s = br.readLine();
            st = new StringTokenizer(s, ",");

            while (st.hasMoreTokens()) {
                String keyword = st.nextToken();
                set.remove(keyword);
            }

            System.out.println(set.size());
        }
    }
}
