package level1;

// 제일 작은 수 제거하기

public class Q18 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] arr2 = {10};
	}
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1>0?arr.length-1:1];
        int min = arr[0];
        for (int a: arr)
            if(min>a) min = a;
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=min){
                answer[j] = arr[i];
                j++;
            }
        }
        if(answer.length == 1)
            answer[0] = -1;
        return answer;
    }
}
