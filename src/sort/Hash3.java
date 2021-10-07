package sort;

import java.util.HashMap;
import java.util.Iterator;

class Hash3 {
    public int solution(String[][] clothes) {
    	
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1]; // key = headgear
            
            if(!map.containsKey(key)) { // �ǻ��� ������ ó��.
                map.put(key, 1); // headgear, 1 / eyewear, 1
            } else {
                map.put(key, map.get(key) + 1); // headgear, 2
            }
        }
        Iterator<Integer> it = map.values().iterator();
        /*
         * �� �������� �ϳ��� �԰ų�, ���԰ų��� �������� �ֱ� ������ ���� ������ ���Դ� �������� �ϳ� �߰��Ѵ�.
		 * �׸��� ���� ���� ������ ���ÿ� �Ͼ�� ���̱� ������, �� �ʵ��� ���� ����� ���� ����Ѵ�.
		 * �� ��, �ϳ��� ���Դ� �������� �����Ƿ� �� ����� �� �ϳ��� ����.
		 * */
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
