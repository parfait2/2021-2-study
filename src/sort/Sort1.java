package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
        	List<Integer> arr = new ArrayList<Integer>();
        	for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
        		arr.add(array[j]);
        	}
        	Collections.sort(arr);
        	answer[i] = arr.get(commands[i][2]-1);
        }
        
        return answer;
    }
    public static void main(String[] args) {
    	int[] input1 = {1, 5, 2, 6, 3, 7, 4};
    	int[][] input2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    	
    	Sort1 sort = new Sort1();
    	int[] result = Sort1.solution(input1, input2);
    	
    	for(int i = 0; i < result.length; i++) {
    		System.out.print(result[i] + " ");
    	}
    }
}
