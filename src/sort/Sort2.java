package sort;

import java.util.*;

class Sort2 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        // input : int 배열, output : String 배열
        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }     
        
        // 내림차순 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
                // 오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
        });
        
        // 예외처리 : 첫 번째 값이 0이면 0을 return
        if (str[0].equals("0")) return "0";
        
        // 0이 아니면 문자열을 더해준다.
        for(String s: str) answer += s;
 
        return answer;
    }
}