package level1;

// ÇÏ»þµå ¼ö

public class Q13 {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(12);
		System.out.println(11);
		System.out.println(13);
	}
    public static boolean solution(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        int sum = 0;
        for(int i=0; i<num.length(); i++){
            sum += Integer.parseInt(num.substring(i,i+1));
        }
        if(x%sum != 0){
            answer = false;
        }
        return answer;
    }
}