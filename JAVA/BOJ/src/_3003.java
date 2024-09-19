import java.io.*;
import java.util.*;

public class _3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = {1,1,2,2,2,8};

        for (int i = 0; i < 6; i++) {
            int x = Integer.parseInt(st.nextToken());

            int result = arr[i] - x;
            sb.append(result + " ");
        }

        System.out.println(sb);
    }
}