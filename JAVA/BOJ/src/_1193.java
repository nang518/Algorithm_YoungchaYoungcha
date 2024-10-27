import java.io.*;

public class _1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int crossCnt = 1, prefixSum = 0;

        while (true) {
            if (x <= prefixSum + crossCnt) {
                if (crossCnt % 2 == 0) {
                    int a = x - prefixSum;
                    int b = crossCnt - (x - prefixSum - 1);
                    sb.append(a + "/" + b + "\n");
                    break;
                }
                else {
                    int a = crossCnt - (x - prefixSum - 1);
                    int b = x - prefixSum;
                    sb.append(a + "/" + b + "\n");
                    break;
                }
            }

            else {
                prefixSum += crossCnt;
                crossCnt++;
            }

        }

        System.out.println(sb);
    }
}