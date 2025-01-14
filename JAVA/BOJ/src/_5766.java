import java.io.*;
import java.util.*;

public class _5766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            int arr[] = new int[10001];

            for (int i = 0; i < 10001; i++) {
                arr[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    int x = Integer.parseInt(st.nextToken());
                    arr[x]++;
                }
            }

            ArrayList<Integer> list = new ArrayList<>();

            for (int i : arr) {
                list.add(i);
            }

            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                if (arr[i] == list.get(list.size() - 2)) {
                    sb.append(i + " ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
