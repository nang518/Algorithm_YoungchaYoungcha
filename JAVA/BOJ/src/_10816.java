import java.io.*;
import java.util.*;

public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer,Integer> cards = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (cards.get(num) == null) cards.put(num,1);
            else cards.put(num,cards.get(num)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (cards.get(tmp) == null) sb.append(0).append(" ");
            else sb.append(cards.get(tmp)).append(" ");
        }

        System.out.println(sb);
    }
}