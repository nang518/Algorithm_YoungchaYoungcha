import java.util.*;
public class 신입사원 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++)
        {
            int N = scanner.nextInt();
            int arr[][] = new int[N][2];
            for (int j = 0; j < N; j++)
            {
                arr[j][0] = scanner.nextInt();
                arr[j][1] = scanner.nextInt();
            }

            int count = N;
            for(int j=0; j<N; j++)
            {
                for(int k=0; k<N; k++)
                {
                    if(arr[j][0] > arr[k][0])
                    {
                        if(arr[j][1]>arr[k][1]) {
                            count -= 1;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}