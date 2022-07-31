import java.util.*;
public class 최고의피자 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //토핑종류
        int A = scanner.nextInt(); //도우가격
        int B = scanner.nextInt(); //토핑가격
        int C = scanner.nextInt(); //도우열량
        Integer D[] = new Integer[N];
        for(int i=0; i<N; i++)
        {
            //각토핑열량
            D[i] = scanner.nextInt();
        }
        Arrays.sort(D, Collections.reverseOrder());

        int kCal = C/A;
        int price = A, Cal_sum = C;
        for(int i=0; i<N; i++)
        {
            price += B;
            Cal_sum += D[i];
            int tmp = Cal_sum / price;
            if(kCal > tmp)
                break;
            else
                kCal = tmp;
        }
        System.out.print(kCal);
    }
}