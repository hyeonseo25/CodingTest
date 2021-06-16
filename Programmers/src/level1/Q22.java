package level1;

//자릿수 더하기

public class Q22 {
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
    public static int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for(int i=0; i<num.length(); i++){
            answer += Integer.parseInt(num.substring(i,i+1));
        }

        return answer;
    }
}
