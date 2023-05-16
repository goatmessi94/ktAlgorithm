package Hash;

import java.util.*;
public class PhoneNumber {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        //전화번호 부를 만듬
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i=0; i<phone_book.length;i++){
            hashMap.put(phone_book[i],1);
        }

        for (int i=0; i<phone_book.length; i++) {
            for (int j=1; j<phone_book[i].length(); j++) {
                if (hashMap.containsKey(phone_book[i].substring(0,j))) {
                    System.out.println(phone_book[i].substring(0,j));
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String[] number = {"119", "97674223", "1195524421"};
        System.out.println(phoneNumber.solution(number));

        String hello = "hello";

        for (int i=1; i<hello.length(); i++) {
            System.out.println(hello.substring(0,i));
        }
    }
}
