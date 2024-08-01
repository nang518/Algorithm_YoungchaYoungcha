import java.io.*;
import java.util.*;

public class _26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (set.contains(a) || set.contains(b)) {
                set.add(b);
                set.add(a);
            }
        }

        System.out.println(set.size());
    }
}