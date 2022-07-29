import java.util.*;
public class ATM {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int pre=0, sum=0;
        for(int i=0; i<N; i++)
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<N; i++)
        {
            sum += pre + arr[i];
            pre += arr[i];
        }
        System.out.print(sum);
    }
}