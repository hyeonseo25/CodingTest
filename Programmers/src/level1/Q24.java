package level1;

public class Q24 {
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
	}
    public static int solution(String s) {
        int answer = 0;
        try{
            answer = Integer.parseInt(s);
        }catch(NumberFormatException e){
            answer = Integer.parseInt(s.substring(1));
            answer *= -1;
        }
        return answer;
    }
}