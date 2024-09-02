import java.io.*;
import java.util.*;

public class _2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[7];
        int max = 0;
        int maxIndex = 0;
        int total = 0;

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        arr[first]++;
        arr[second]++;
        arr[third]++;

        for (int i = 6; i > 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        if (max == 1) {
            total = maxIndex * 100;
        }

        else if (max == 2) {
            total = maxIndex * 100 + 1000;
        }

        else if (max == 3) {
            total = maxIndex * 1000 + 10000;
        }

        System.out.println(total);
    }
}