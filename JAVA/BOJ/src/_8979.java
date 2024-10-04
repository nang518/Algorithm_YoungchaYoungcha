import java.io.*;
import java.util.*;

public class _8979 {
    static int n,k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        Medal[] arr = new Medal[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Medal();
            st = new StringTokenizer(br.readLine());
            arr[i].country = Integer.parseInt(st.nextToken());
            arr[i].gold = Integer.parseInt(st.nextToken());
            arr[i].silver = Integer.parseInt(st.nextToken());
            arr[i].bronze = Integer.parseInt(st.nextToken());
        }

        int result = CountryRank(arr);
        System.out.println(result);


    }

    static class Medal {
        int country;
        int gold;
        int silver;
        int bronze;
    }

    static int CountryRank(Medal[] arr) {
        int rank = 1;
        int find = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].country == k) {
                find = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i].gold > arr[find].gold) rank++;
            else if (arr[i].gold == arr[find].gold && arr[i].silver > arr[find].silver) rank++;
            else if (arr[i].gold == arr[find].gold && arr[i].silver == arr[find].silver && arr[i].bronze > arr[find].bronze) rank++;
        }
        return rank;
    }
}