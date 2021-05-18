package level1;

// x만큼 간격이 있는 n개의 숫자

public class Q10 {
	public static void main(String[] args) {
		long[] arr = solution(2,5);
		for(long a:arr) {
			System.out.print(a + " ");
		}
		System.out.println("");
		long[] arr2 = solution(4,3);
		for(long a:arr2) {
			System.out.print(a + " ");
		}
		System.out.println("");
		long[] arr3 = solution(-4,2);
		for(long a:arr3) {
			System.out.print(a + " ");
		}
	}
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i=1; i<n; i++){
            answer[i] = answer[i-1]+x;
        }
        
        return answer;
    }
}