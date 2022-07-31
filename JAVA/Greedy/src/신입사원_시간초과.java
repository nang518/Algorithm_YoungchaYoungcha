//import java.util.*;
//public class 신입사원 {
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//
//        for(int i=0; i<T; i++)
//        {
//            int N = scanner.nextInt();
//            int arr[][] = new int[N][2];
//            for(int j=0; j<N; j++)
//            {
//                arr[j][0] = scanner.nextInt();
//                arr[j][1] = scanner.nextInt();
//            }
//            Arrays.sort(arr, new Comparator<int[]>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//                    return o1[0] - o2[0];
//                }
//            });
//
//            int count = 1;
//            int max = arr[0][1];
//            for(int j=0; j<N; j++)
//            {
//                if (max > arr[j][1]) {
//                    count += 1;
//                    max = arr[j][1];
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}

import java.util.*;
public class 신입사원_시간초과 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++)
        {
            int N = scanner.nextInt();
            String arr[] = new String[N];
            for(int j=0; j<N; j++)
            {
                arr[i] = scanner.nextLine();
            }

        }
    }
}