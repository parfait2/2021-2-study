package sort;

import java.util.*;

class Sort2 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        // input : int �迭, output : String �迭
        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }     
        
        // �������� ����
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
                // �������� ���� (o1+o2).compareTo(o1+o2);
            }
        });
        
        // ����ó�� : ù ��° ���� 0�̸� 0�� return
        if (str[0].equals("0")) return "0";
        
        // 0�� �ƴϸ� ���ڿ��� �����ش�.
        for(String s: str) answer += s;
 
        return answer;
    }
}