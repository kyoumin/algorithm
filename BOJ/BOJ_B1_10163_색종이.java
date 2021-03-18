// 소요시간: 30m
import java.util.Scanner;

public class BOJ_10163_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[101][101]; //평면 
		
		int N = sc.nextInt(); //색종이 개수
		
		for(int n = 1; n <= N; n++) { //색종이 개수만큼 반복
			
			int h1 = sc.nextInt();
			int w1 = sc.nextInt();
			int h2 = sc.nextInt();
			int w2 = sc.nextInt();
			for(int i = h1; i < h1+h2; i++) {
				for(int j = w1; j < w1+w2; j++) {
					map[i][j] = n; // 색종이 넓이만큼 번호 채우기
				}
			}	
		}
		
		int[] cnt = new int[N+1]; //보이는 면적
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				cnt[map[i][j]]++; // 색종이 면적 세기
			}
		}
		
		for(int i = 1; i < cnt.length; i++) {
			System.out.println(cnt[i]); //색종이 면적 출력
		}
	}
}
