package Hash;

import java.util.Arrays;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, (a,b) -> (0-b[1]) - (0-a[1]));
        int sum = 0;
        sum += jobs[0][1] - jobs[0][0];
        for (int i=1; i<jobs.length; i++) {
            if (jobs[i-1][1] < jobs[i][0]) {
                sum += (jobs[i][0] - jobs[i-1][1]) + (jobs[i][1] - jobs[i][0]);
            } else {
                System.out.println((jobs[i-1][1] - jobs[i][0]) + (jobs[i][1] - jobs[i][0]));
                sum += (jobs[i-1][1] - jobs[i][0]) + (jobs[i][1] - jobs[i][0]);
            }
        }
        System.out.println(sum);
        System.out.println(sum/ jobs.length);
        return answer;
    }

    public static void main(String[] args) {
        int [][] jobs = {{0, 3}, {2, 9}, {2, 6}};
        DiskController diskController = new DiskController();
        diskController.solution(jobs);
    }
}
