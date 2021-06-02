package level1;

// Â¦¼ö¿Í È¦¼ö

public class Q17 {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
    public static String solution(int num) {
        String answer = "Odd";
        if(num%2==0){
            answer="Even";
        }
        return answer;
    }
}
