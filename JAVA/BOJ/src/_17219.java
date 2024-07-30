import java.io.*;
import java.util.*;

public class _17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, String> login = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String web = st.nextToken();
            String password = st.nextToken();

            login.put(web, password);
        }

        while (m-- > 0) {
            String q = br.readLine();

            if (login.containsKey(q)) {
                sb.append(login.get(q)).append('\n');
            }
        }

        System.out.println(sb);
    }
}