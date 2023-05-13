package Sort;

import java.util.Arrays;
public class Knumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) { //commands 만큼 반복

            int[] temp = new int[commands[i][1] - commands[i][0]+1];

            int index = 0;

            if (commands[i][0] == commands[i][1]) {
                answer[i] = array[commands[i][0] -1];
                continue;
            }

            for (int j=commands[i][0] -1; j < commands[i][1] ; j++) { //선택한 값만큼 반복
                //채우고
                temp[index] = array[j];
                index++;
            }

            //정렬 후 인덱스 값 채워서 answer에 0부터 삽입
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Knumber knumber = new Knumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        knumber.solution(array, commands);
    }
}



/*
모범 답안
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
 */