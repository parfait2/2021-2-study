package sort;

import java.util.Arrays;

class Hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        
        while(i < completion.length) {
            if(!completion[i].equals(participant[i])) {
                temp = participant[i];
                break;
            } else {
                i++;
            }
        }
        
        if(!temp.equals("")) {
            answer = temp;
        } else {
            answer = participant[participant.length-1]; // while에 해당하지 않는 경우
        }
        return answer;
    }
}