import java.io.*;
import java.util.*;

public class _10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            st = new StringTokenizer(br.readLine());

            int caseNum = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 20; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (list.get(i) < list.get(j)) cnt++;
                }
            }

            sb.append(tc+1 + " " + cnt).append("\n");
        }

        System.out.println(sb);
    }
}
