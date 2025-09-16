import java.io.*;
import java.util.*;

public class _3758 {

    static class Team {
        int id;
        int[] scoreList;
        int submitCnt;
        int lastSubmit;
        int total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Team[] list = new Team[n];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int teamId = Integer.parseInt(st.nextToken());
                int problemNum = Integer.parseInt(st.nextToken());
                int problemScore = Integer.parseInt(st.nextToken());

                if (list[teamId-1] == null) {
                    list[teamId-1] = new Team();
                    list[teamId-1].id = teamId;
                    list[teamId-1].scoreList = new int[k+1];
                }

                list[teamId-1].submitCnt++;
                list[teamId-1].lastSubmit = i;
                list[teamId-1].scoreList[problemNum] = Math.max(problemScore, list[teamId-1].scoreList[problemNum]);
            }

            for (int i = 0; i < n; i++) {
                int sum = 0;

                for (int j = 1; j <= k; j++ ) {
                    sum += list[i].scoreList[j];
                }

                list[i].total = sum;
            }

            Arrays.sort(list, new Comparator<Team>() {
                @Override
                public int compare(Team o1, Team o2) {
                    if (o1.total == o2.total) {
                        if (o1.submitCnt == o2.submitCnt) {
                            return o1.lastSubmit - o2.lastSubmit;
                        }

                        return o1.submitCnt - o2.submitCnt;
                    }

                    return o2.total - o1.total;
                }
            });

            for (int i = 0; i < n; i++) {
                if (list[i].id == t) {
                    System.out.println(String.valueOf(i+1));
                }
            }
        }
    }
}