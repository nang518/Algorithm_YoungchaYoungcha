import java.io.*;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String number = br.readLine();

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i) - '0';
            sum += num;
        }
        System.out.println(sum);
    }
}