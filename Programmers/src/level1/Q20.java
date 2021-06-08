package level1;

// 정수 내림차순으로 배치하기

public class Q20 {
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
    public static long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        int[] arr = new int[num.length()];
        for(int i=0; i<num.length(); i++) {
            arr[i] = Integer.parseInt(num.substring(i,i+1));
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        num="";
        for(int a :arr){
            num += Integer.toString(a);
        }
        answer = Long.parseLong(num);
        return answer;
    }
}