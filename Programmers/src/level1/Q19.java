package level1;

// 정수 제곱근 판별

public class Q19 {
	public static void main(String[] args) {
		System.out.println(121);
		System.out.println(3);
	}
    public static long solution(long n) {
    	 if (Math.pow((int)Math.sqrt(n), 2) == n) {
             return (long) Math.pow(Math.sqrt(n) + 1, 2);
         }

         return -1;
    }
}