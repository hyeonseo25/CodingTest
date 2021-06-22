package level1;

// 두 정수 사이의 합

public class Q26 {
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(3,3));
		System.out.println(solution(5,3));
	}
    public static long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        for(int i=a; i<=b; i++){
            answer += i;
        }
        return answer;
    }
}
