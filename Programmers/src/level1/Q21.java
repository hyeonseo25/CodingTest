package level1;

// ���ڼ��ڼ��ڼ��ڼ��ڼ�?

public class Q21 {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
    public static String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            if(i%2==0)
                answer += "��";
            else
                answer += "��";
        }
        return answer;
    }
}
