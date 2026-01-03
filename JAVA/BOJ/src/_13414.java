import java.io.*;
import java.util.*;

public class _13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedHashSet<String> set = new LinkedHashSet<>();

        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        while (l-- > 0) {
            String s = br.readLine();

            if (set.contains(s)) set.remove(s);
            set.add(s);
        }

        int cnt = 0;

        for (String x : set) {
            sb.append(x + "\n");
            cnt++;

            if (cnt == k) break;
        }

        System.out.println(sb);
    }
}
