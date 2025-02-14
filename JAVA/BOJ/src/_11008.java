import java.io.*;
import java.util.*;

public class _11008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String p = st.nextToken();

            s = s.replaceAll(p,".");
            sb.append(s.length() + "\n");
        }

        System.out.println(sb);
    }
}