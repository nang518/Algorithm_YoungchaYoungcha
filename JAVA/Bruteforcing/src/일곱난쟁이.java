import java.util.*;
public class 일곱난쟁이 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        int not1=0, not2=0;

        for(int i=0; i< arr.length; i++)
        {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(sum-arr[i]-arr[j] == 100)
                {
                    not1 = i;
                    not2 = j;
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            if(i==not1 || i==not2)
                continue;
            System.out.println(arr[i]);
        }
    }
}