import java.io.*;
import java.util.*;

public class _23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a = (h-1) / (n+1) + 1;
        int b = (w-1) / (m+1) + 1;

        System.out.println(a * b);
    }
}
