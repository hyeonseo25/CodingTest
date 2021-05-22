package level1;

// Çà·ÄÀÇ µ¡¼À

public class Q11 {
	public static void main(String[] args) {
		int[][] arr1_1 = {{1,2},{2,3}};
		int[][] arr1_2 = {{3,4},{5,6}};
		int[][] arr2_1 = {{1},{2}};
		int[][] arr2_2 = {{3},{4}};
		
	}
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}