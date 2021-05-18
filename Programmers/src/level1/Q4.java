package level1;

import java.util.ArrayList;

// 같은 숫자는 싫어

public class Q4 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
	}
    public int[] solution(int []arr) {
        int[] answer = {};
        int temp=-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(!(temp==arr[i])){
                list.add(arr[i]);
                temp=arr[i];
            }
        }
        int[] answer2 = new int[list.size()];
        for(int i=0; i<answer2.length; i++){
            answer2[i]=list.get(i).intValue();
        }
        answer=answer2;
        return answer;
    }
}
