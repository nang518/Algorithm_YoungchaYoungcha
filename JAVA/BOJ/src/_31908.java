import java.io.*;
import java.util.*;

public class _31908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Map<String, List<String>> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String p = st.nextToken();
            String s = st.nextToken();

            if (s.charAt(0) == '-') continue;

            List<String> list = map.getOrDefault(s, new ArrayList<>());
            list.add(p);
            map.put(s, list);
        }

        int cnt = 0;

        for (List<String> list : map.values()) {
            if (list.size() != 2) continue;
            cnt++;
            sb.append(list.get(0) + " " + list.get(1) + "\n");
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}
