import java.io.*;

public class _11729 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        hanoi(1,3,n);

        int cnt = (int)(Math.pow(2,n)-1);
        System.out.println(cnt);
        System.out.println(sb);
    }

    static void hanoi(int a, int b, int n) {
        if (n == 1) {
            sb.append(a + " " + b + "\n");
            return;
        }

        hanoi(a, 6-a-b, n-1);
        sb.append(a + " " + b + "\n");
        hanoi(6-a-b, b, n-1);
    }
}
