package sort;

import java.util.HashMap;
import java.util.Iterator;

class Hash3 {
    public int solution(String[][] clothes) {
    	
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1]; // key = headgear
            
            if(!map.containsKey(key)) { // 의상의 종류가 처음.
                map.put(key, 1); // headgear, 1 / eyewear, 1
            } else {
                map.put(key, map.get(key) + 1); // headgear, 2
            }
        }
        Iterator<Integer> it = map.values().iterator();
        /*
         * 각 종류들은 하나를 입거나, 안입거나의 선택지가 있기 때문에 옷의 개수에 안입는 선택지를 하나 추가한다.
		 * 그리고 옷을 고르는 선택은 동시에 일어나는 일이기 때문에, 각 옷들을 곱해 경우의 수를 계산한다.
		 * 이 때, 하나도 안입는 선택지는 없으므로 그 경우의 수 하나를 뺀다.
		 * */
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
