package Hash;

import java.util.PriorityQueue;

public class MoreHot {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int aScovile : scoville) {
            heap.offer(aScovile);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return  -1;
            }

            int minOne = heap.poll();
            int minTwo = heap.poll();

            int plusK = minOne + (minTwo * 2);
            heap.offer(plusK);
            answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        MoreHot moreHot = new MoreHot();
        int[] tempOne = {1,2,3,9,10,12};
        int tempTwo = 7;
        System.out.println(moreHot.solution(tempOne, tempTwo));
    }

}
