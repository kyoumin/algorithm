import java.util.Arrays;
import java.util.Scanner;

public class 신도시빌딩세우기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {

			int N = sc.nextInt();
			char[][] map = new char[N][];
			for (int i = 0; i < N; i++) {
				map[i] = sc.next().toCharArray();
			}

			int max = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'B') {

						// 팔방탐색
						int cnt = 0;
						int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
						int[] dy = { 0, 0, -1, 1, 1, -1, -1, 1 };
						int check = 0;
						for (int d = 0; d < 8; d++) { //G가 하나라도 있으면 B는 2
							int nx = i + dx[d];
							int ny = j + dy[d];
							if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
							if (map[nx][ny] == 'G') {
								cnt = 2;
								check = 1;
								break;
							}

						}
						if (check != 1) { //주변에 G가 없으면
							cnt = 0;
							
							for (int k = 0; k < N; k++) {
								if (map[k][j] == 'B')
									cnt += 1;
								if (map[i][k] == 'B')
									cnt += 1;
							}
							cnt = cnt - 1;
						}
						if (cnt > max)
							max = cnt;
						cnt = 0;
					}
				}

			}
			System.out.println("#" + t + " " + max);
			max = 0;
		}
	}
}