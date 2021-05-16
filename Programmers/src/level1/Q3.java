package level1;

// 문자열 내 p와 y의 개수

public class Q3 {
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
    public static boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("p")||String.valueOf(s.charAt(i)).equals("P")){
                p++;
            }else if(String.valueOf(s.charAt(i)).equals("y")||String.valueOf(s.charAt(i)).equals("Y")){
                y++;
            }
        }
        if(p==y){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
