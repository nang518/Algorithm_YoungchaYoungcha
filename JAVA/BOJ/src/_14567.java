import java.io.*;
import java.util.*;

public class _14567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr[] = new ArrayList[n+1];
        int[] indegree = new int[n+1];
        int[] result = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a].add(b);
        }

        for (int i = 1; i <= n; i++) {
            result[i] = 1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            for (int idx : arr[i]) {
                result[idx] = Math.max(result[idx], result[i] + 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }
}
