import java.util.*;
public class 등수매기기 {
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
        long sum = 0;
        int abs;
        for(int i=0; i<N; i++)
        {
            abs = Math.abs(arr[i]-(i+1));
            sum += abs;
        }
        System.out.print(sum);
    }
}