import java.util.Scanner;
public class 컵홀더 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //String arr[] = new String[N];
        String str = scanner.next();
        char arr[] = new char[N];
        int cnt = 1;
        for(int i=0; i<N; i++)
        {
            arr[i] = str.charAt(i);
        }
        for(int i=0; i<N; i++)
        {
            if(arr[i]=='S')
                cnt++;
            if(arr[i]=='L') {
                i = i + 1;
                cnt++;
            }
        }

        if(cnt>N)
            System.out.print(N);
        else
            System.out.print(cnt);
    }
}