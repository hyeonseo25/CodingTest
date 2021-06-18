package level1;

// 문자열 다루기 기본

public class Q23 {
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4&&s.length()!=6) answer = false;
        try{
            int a = Integer.parseInt(s);
        }catch(NumberFormatException e){
            answer = false;
        }
        
        return answer;
    }
}