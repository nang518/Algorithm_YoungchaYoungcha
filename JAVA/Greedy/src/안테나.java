import java.util.*;
public class 안테나 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        if(N%2==0)
            System.out.print(arr[N/2-1]);
        else
            System.out.print(arr[N/2]);
    }
}