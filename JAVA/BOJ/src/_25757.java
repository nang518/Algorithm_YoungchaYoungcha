import java.io.*;
import java.util.*;

public class _25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        Set<String> set = new HashSet<>();

        while (n-- > 0) {
            String id = br.readLine();
            set.add(id);
        }

        if (s.equals("Y")) System.out.println(set.size());
        else if (s.equals("F")) System.out.println(set.size() / 2);
        else System.out.println(set.size() / 3);
    }
}
