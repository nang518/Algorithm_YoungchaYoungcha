import java.io.*;
import java.util.*;

public class _21425 {
    static int cnt;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            ans = Integer.parseInt(st.nextToken());

            cnt = 0;

            if (x > y) dfs(x,y);
            else dfs(y,x);

            System.out.println(cnt);
        }
    }

    public static void dfs(int x, int y) {
        int sum = x+y;
        cnt++;

        if (sum > ans) return;
        dfs(sum,x);
    }
}
