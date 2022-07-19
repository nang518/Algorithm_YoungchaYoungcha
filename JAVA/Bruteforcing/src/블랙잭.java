import java.util.*;
public class 블랙잭 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int result = search(arr,N,M);
        System.out.print(result);
    }

    static int search(int[] arr, int N, int M)
    {
        int result = 0;
        for(int i=0; i<N-2; i++)
        {
            for(int j=i+1; j<N-1; j++)
            {
                for(int k=j+1; k<N; k++)
                {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == M)
                        return sum;
                    if(result < sum && sum < M)
                        result = sum;
                }
            }
        }
        return result;
    }
}