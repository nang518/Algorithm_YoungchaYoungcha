import java.io.*;
import java.util.*;

public class _11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 오름차순 정렬
        Arrays.sort(arr);

        int sum = 0;
        int add = 0;

        for (int i = 0; i < n; i++) {
            add += arr[i];
            sum += add;
        }

        System.out.print(sum);
    }
}