import java.util.Scanner;
public class 수들의합 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long sum = 0;
        int cnt = 0;
        for(int i=1; ;i++)
        {
            if(sum > S) {
                cnt -= 1;
                break;
            }
            sum += i;
            cnt++;
        }
        System.out.print(cnt);
    }
}