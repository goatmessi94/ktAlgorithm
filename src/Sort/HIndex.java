package Sort;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i=citations.length; i > 0; i--) {
            int count = 0;
            for (int j=0; j<citations.length; j++) {
                if (i <= citations[j] ) {
                    count++;
                }
            }

            if (count >= i) {
                answer = i;
                System.out.println("answer"+answer);
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] k = {3,0,6,1,5};
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.solution(k));
    }
}
