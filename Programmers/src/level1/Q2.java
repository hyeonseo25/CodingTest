package level1;

// ���￡�� �輭�� ã��

public class Q2 {
	public static void main(String[] args) {
		String[] arr = {"Jane", "Kim"};
		System.out.println(solution(arr));
	}
    public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "�輭���� "+i+"�� �ִ�";
                break;
            }
        }
        return answer;
    }
}