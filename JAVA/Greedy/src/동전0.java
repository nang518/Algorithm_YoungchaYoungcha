import java.util.*;
public class 동전0 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        Integer[] money = new Integer[N];
        for(int i=0; i<N; i++)
        {
            money[i] = scanner.nextInt();
        }
        Arrays.sort(money, Collections.reverseOrder());

        int cnt = 0;
        for(int i=0; i<N; i++)
        {
            if(K>=money[i])
            {
                cnt += K/money[i];
                K %= money[i];
            }
            else if(K==0)
                break;
        }
        System.out.print(cnt);
    }
}