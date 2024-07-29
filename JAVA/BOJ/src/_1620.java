import java.io.*;
import java.util.*;

public class _1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();

            map1.put(i, name);
            map2.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();

            if (49 <= s.charAt(0) && s.charAt(0) <= 57) {
                sb.append(map1.get(Integer.parseInt(s))).append('\n');
            } else {
                sb.append(map2.get(s)).append('\n');
            }
        }

        System.out.println(sb);
    }
}
