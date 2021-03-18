import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	static class MyComp implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) { // 3,5   ==>  5 3 // 7, 7 ==> 7 7  
													 // 10, 9 ==> 10 9
			//return o1 - o2; // -2 : 음수 ==> 원소를 그대로 둠
							//  0 : 0 ==> 원소를 그대로 둠
							//  2 : 양수 ==> 교환처리 
			
			return o2-o1; // 2 : 양수 ==> 교환처리 
						  // -1 : 음수 ==> 원소를 그대로 둠
		}
		
	}
	public static void main(String[] args) {

//		int[] arr = {4,10,6,39,2};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		for(int i=arr.length-1; i>=0; --i) {
//			System.out.println(arr[i]);
//		}
		
		Integer[] arr = {new Integer(4),10,6,39,2};
//		Arrays.sort(arr,new MyComp());
//		Arrays.sort(arr);
		Arrays.sort(arr,Comparator.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[][] arr2 = {
				{1,22,33},
				{2,22,56},
				{3,60,20}
		};
		
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) { // {1,22,33},  {2,23,56}
//				return o2[0] - o1[0];
//				return o1[2] - o2[2];
//				return o2[1] - o1[1];
				// 첫번째 과목 기준으로 내림차순, 첫과목 점수가 같으면 두번째과목 기준으로 내림차순
				int res = o2[1] - o1[1];
				if(res==0) {
					res = o2[2] - o1[2];
				}
				return res;
			}
			
		});
		
		for (int[] is : arr2) {
			System.out.println(Arrays.toString(is));
		}
	}

}










