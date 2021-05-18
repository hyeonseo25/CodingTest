package level1;

import java.util.ArrayList;

// ÆùÄÏ¸ó

public class Q9 {
	public static void main(String[] args) {
		int[] arr = {3,1,2,3};
		int[] arr2 = {3,3,3,2,2,4};
		int[] arr3 = {3,3,3,2,2,2};
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
	}
    public static int solution(int[] nums) {
    	int answer = 0;
        int max = nums.length/2;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
                if(arr.size()>=max){
                    break;
                }
            }
        }
        answer = arr.size();
        return answer;
    }
}