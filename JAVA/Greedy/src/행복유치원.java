import java.util.*;
public class 행복유치원 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //원생수
        int K = scanner.nextInt(); //조 개수
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int diff[] = new int[N-1];
        for(int i=0; i<N-1; i++)
        {
            diff[i] = arr[i+1] - arr[i];
        }
        Arrays.sort(diff);

        int answer = 0;
        for(int i=0; i<N-K; i++)
        {
            answer += diff[i];
        }
        System.out.print(answer);
    }
}