import java.util.*;
public class 분해합 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int result = 0;

        for(int i=0; i<N; i++)
        {
            int num = i;
            int sum = 0;

            while(num != 0)
            {
                sum += num % 10;
                num /= 10;
            }
            if(sum+i == N)
            {
                result = i;
                break;
            }

        }
        System.out.print(result);
    }
}