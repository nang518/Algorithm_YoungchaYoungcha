import java.io.*;
import java.util.*;

public class _2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int x = arr[i] + arr[j] + arr[k];
                    if (x <= m) list.add(x);
                }
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0));
    }
}
