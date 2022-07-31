import java.util.*;
public class YonseiTOTO {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int min[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            int P = scanner.nextInt();
            int L = scanner.nextInt();

            Integer mil[] = new Integer[P];
            for(int j=0; j<P; j++)
            {
                mil[j] = scanner.nextInt();
            }
            if(P<L)
            {
                min[i] = 1;
                continue;
            }
            else {
                Arrays.sort(mil, Collections.reverseOrder());
                min[i] = mil[L - 1];
            }
        }

        Arrays.sort(min);
        int cnt=0, sum=0;
        for(int i=0; i<n; i++)
        {
            sum += min[i];
            if(sum>m)
                break;
            cnt++;
        }
        System.out.print(cnt);
    }
}