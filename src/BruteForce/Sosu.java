package BruteForce;

import java.util.*;

public class Sosu {
    HashSet<Integer> numberSet = new HashSet<>();
    public void recursive(String comb, String others) {
        if(!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));
        for (int i=0; i<others.length();i++) {
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    public int solution (String numbers) {
        recursive("",numbers);
        System.out.println(numberSet);
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Sosu sosu = new Sosu();
        System.out.println(sosu.solution("178932"));
    }
}
