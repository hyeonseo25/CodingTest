package level1;

// 최대공약수와 최소공배수

public class Q16 {
	public static void main(String[] args) {
		int[] arr = solution(3,12);
		for(int a:arr) {
			System.out.print(a + " ");
		}
		System.out.println("");
		int[] arr2 = solution(2,5);
		for(int a:arr2) {
			System.out.print(a + " ");
		}
		
	}
    public static int[] solution(int n, int m) {
    	int[] answer = new int[2];
        if(n>m){
            int temp = n;
            n = m;
            m = temp;
        }
        answer[0] = 1;
        for(int i=n; i>=1; i--){
            if(m%i==0&&n%i==0){
                answer[0] = i;
                break;
            }
        }
        answer[1] = n*m/answer[0];
        return answer;
    }
}
