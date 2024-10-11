import java.io.*;
import java.util.*;

public class _2070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;
        char result;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) result = '>';
            else if (a == b) result = '=';
            else result = '<';

            sb.append("#" + idx + " " + result).append('\n');
            idx++;
        }

        System.out.println(sb);
    }
}