import java.io.*;
import java.util.*;

public class _2456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] pointList = new int[4][4];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());

            // 각 학생이 받은 점수 개수 카운트
            pointList[1][one]++;
            pointList[2][two]++;
            pointList[3][three]++;
        }

        int max = -1, best = -1, same = -1;

        for (int i = 1; i < 4; i++) {
            int sum = pointList[i][1] + (2 * pointList[i][2]) + (3 * pointList[i][3]);

            if (sum > max) {
                max = sum;
                best = i;
                same = 0;
            }

            else if (sum == max) {
                if (pointList[best][3] < pointList[i][3]) { // 3점 개수 비교
                    best = i;
                    same = 0;
                }

                else if (pointList[best][3] == pointList[i][3] && pointList[best][2] < pointList[i][2]) { // 2점 개수 비교
                    best = i;
                    same = 0;
                }

                else if (pointList[best][3] == pointList[i][3] && pointList[best][2] == pointList[i][2]) {
                    same = 1;
                }
            }
        }

        if (same == 0) {
            System.out.println(best + " " + max);
        }

        else {
            System.out.println(0 + " " + max);
        }
    }
}