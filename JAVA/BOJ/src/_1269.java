import java.io.*;
import java.util.*;

public class _1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (a.contains(tmp)) {
                a.remove(tmp);
            } else {
                b.add(tmp);
            }
        }

        int result = a.size() + b.size();
        System.out.println(result);
    }
}