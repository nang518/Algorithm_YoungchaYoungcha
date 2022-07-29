import java.util.*;
public class 사과담기게임 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int J = scanner.nextInt();

        int sum = 0, left=1, right=M;
        int apple;
        for(int i=0; i<J; i++)
        {
            apple = scanner.nextInt();
            if(left <= apple && apple <= right)
                continue;
            if(left>apple) {
                sum += Math.abs(left - apple);
                right = apple + (M-1);
                left = apple;
            }
            else if(right < apple) {
                sum += Math.abs(right-apple);
                left = apple - (M-1);
                right = apple;
            }
        }
        System.out.print(sum);
    }
}