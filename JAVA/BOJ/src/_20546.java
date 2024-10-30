import java.io.*;
import java.util.*;

public class _20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[14];

        for (int i = 0; i < 14; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int jhResult = BNP(arr, n);
        int smResult = TIMING(arr, n);

        if (jhResult > smResult) System.out.println("BNP");
        else if (jhResult < smResult) System.out.println("TIMING");
        else System.out.println("SAMESAME");

    }

    static int BNP(int arr[], int money) {
        int jhHave = 0;

        for (int i = 0; i < 14; i++) {
            jhHave += money / arr[i];
            money %= arr[i];
        }

        return money + (jhHave * arr[13]);
    }

    static int TIMING(int arr[], int money) {
        int increase = 0, decrease = 0;
        int smHave = 0;

        for (int i = 0; i < 14; i++) {
            if (i > 0) {
                if (arr[i] > arr[i-1]) {
                    increase++;
                    decrease = 0;
                }

                else if (arr[i] < arr[i-1]) {
                    decrease++;
                    increase = 0;
                }

                else {
                    increase = 0;
                    decrease = 0;
                }

                if (increase == 3) {
                    if (smHave != 0) {
                        money += smHave * arr[i];
                        smHave = 0;
                    }
                    increase = 0;
                    decrease = 0;
                }

                else if (decrease >= 3) {
                    smHave += money / arr[i];
                    money %= arr[i];
                }
            }
        }

        return money + (smHave * arr[13]);
    }
}
