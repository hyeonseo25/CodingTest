package level1;

import java.util.ArrayList;
import java.util.Collections;

// 두 개 뽑아서 더하기

public class Q7 {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,1};
		int[] arr2 = {5,0,2,7};
	}
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        answer = count(numbers);
        return answer;
    }
    public static int[] count(int[] numbers){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        ArrayList<Integer> answer2 = new ArrayList<Integer>();
        for(int a:answer){
            if(!(answer2.contains(a))){
                answer2.add(a);
            }
        }
        Collections.sort(answer2);
        int[] result = new int[answer2.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = answer2.get(i).intValue();
        }
        return result;
    }
}
