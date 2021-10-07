package sort;

import java.util.*;

public class Hash4 {

    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]); // map���� �帣�� ��ü ��� Ƚ���� ��´�.
        }

        // 1. �帣 ����
        ArrayList<String> genres_ordered = new ArrayList<>();
        while(map.size() != 0) { // map�� �ִ� ������� genres_ordered�� �ű��.
            int max = -1;
            String max_key = "";
            
            for(String key : map.keySet()) {
                int tmp_cnt = map.get(key);
                if(tmp_cnt > max){
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }
		
        // 2. �帣 �� �뷡 ����
        ArrayList<Music> result = new ArrayList<>();
        
        for(String gen : genres_ordered) {
            ArrayList<Music> list = new ArrayList<>();
            
            for(int i = 0; i < genres.length; i++) {
                if(genres[i].equals(gen)) { // pop�̸�
                    list.add(new Music(gen, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // �������� ����
            result.add(list.get(0)); 	// 1���� ������ ����
            if(list.size()!= 1){ 	// �� ������ ���� ������(==�帣 ���� �뷡�� 1������ ������) ����
                result.add(list.get(1));
            }
        }
        
        // print result
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
}