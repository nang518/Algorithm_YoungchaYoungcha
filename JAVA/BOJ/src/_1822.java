import java.io.*;
import java.util.*;

public class _1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Long> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            long num = Long.parseLong(st.nextToken());
            set.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            long x = Long.parseLong(st.nextToken());
            if (set.contains(x)) set.remove(x);
        }

        ArrayList<Long> result = new ArrayList<>(set);
        Collections.sort(result);

        sb.append(result.size()).append('\n');

        for (long val : result) {
            sb.append(val + " ");
        }

        System.out.println(sb);
    }
}
