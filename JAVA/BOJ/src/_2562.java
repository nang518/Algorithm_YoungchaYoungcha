import java.io.*;

public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int[] arr = new int[9];
        int result = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;

            if (n > max) max = n;
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] == max) result = i+1;
        }

        System.out.println(max);
        System.out.println(result);
    }
}
