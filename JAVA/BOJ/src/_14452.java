import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class _14452 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(br.readLine());
        }

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            String search = br.readLine();

            if (s.contains(search)) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}