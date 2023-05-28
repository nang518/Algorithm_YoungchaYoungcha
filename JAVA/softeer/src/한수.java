import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i=1; i<n+1; i++) {
            int[] arr = String.valueOf(i).chars().map(Character::getNumericValue).toArray();

            if (i<100) {
                cnt++;
            }
            else if (arr[0]-arr[1] == arr[1]-arr[2]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}