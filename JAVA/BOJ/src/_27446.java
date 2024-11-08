import java.io.*;
import java.util.*;

public class _27446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();
        List<Integer> findArr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr.add(x);
        }

        for (int i = 1; i < n+1; i++) {
            if (!arr.contains(i)) {
                findArr.add(i);
            }
        }

        int last = 0;
        int result = 0;

        for (int i = 0; i < findArr.size(); i++) {
            if (last > 0)  {
               result += Math.min(7, (findArr.get(i)-last)*2);
            } else {
                result += 7;
            }
            last = findArr.get(i);
        }

        System.out.println(result);
    }
}
