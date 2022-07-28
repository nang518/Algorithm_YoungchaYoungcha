import java.util.*;
public class 거스름돈 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        money = 1000 - money;
        int cnt = 0;
        int arr[] = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < arr.length; i++) {
            cnt += money / arr[i];
            money = money % arr[i];
        }
        System.out.print(cnt);
    }
}