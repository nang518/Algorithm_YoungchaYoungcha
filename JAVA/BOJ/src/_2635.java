import java.io.*;
import java.util.*;

public class _2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int maxCnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = n/2; i < n+1; i++) {
            int idx = 0;
            arr.add(n);
            arr.add(i);

            while (true) {
                int tmp = arr.get(idx) - arr.get(idx+1);

                if (tmp < 0) break;
                else {
                    arr.add(tmp);
                    idx++;
                }
            }

            if (arr.size() > maxCnt) {
                answer.clear();
                maxCnt = arr.size();
                answer.addAll(arr);
            }

            arr.clear();
        }

        System.out.println(maxCnt);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
