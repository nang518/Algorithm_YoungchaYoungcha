import java.util.*;
public class 우유축제 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int cnt = 0, now = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == now) {
                cnt++;
                now++;
            }
            if (now == 3)
                now = 0;


        }
        System.out.print(cnt);
    }
}