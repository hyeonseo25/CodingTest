package level1;

// 서울에서 김서방 찾기

public class Q2 {
	public static void main(String[] args) {
		String[] arr = {"Jane", "Kim"};
		System.out.println(solution(arr));
	}
    public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }
}