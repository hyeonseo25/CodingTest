package level1;

// Æò±Õ ±¸ÇÏ±â

public class Q14 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr2 = {5,5};
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
	}
    public static double solution(int[] arr) {
        double answer = 0;
        for(int a:arr){
            answer += a;
        }
        answer /= arr.length;
        return answer;
    }
}