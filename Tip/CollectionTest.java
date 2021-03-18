import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CollectionTest {

	public static void main(String[] args) {

		
		// List : 순서 유지, index로 관리, 데이터중복 허용
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // 10
		list.add(20); // 10 20
		list.add(10); // 10 20 10
		list.add(0,30); // 30 10 20 10
		
//		Collections.sort(list,Comparator.reverseOrder());
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Map : 순서 비유지, key,value 쌍으로 관리, 데이터 중복 허용(key는 unique해야함)
		// 문장에서 각 단어가 몇번씩 등장하는지..
		String stmt = "i am happy happy happy i love you";
		//   i   2
		//   am  1
		//   happy 3
//		HashMap<String,Integer> map = new HashMap<String,Integer>();
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		StringTokenizer st = new StringTokenizer(stmt," ");
		for (int i = 0; i < 8; i++) {
			String word = st.nextToken();
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		Set<String> keys = map.keySet();
		for (String word : keys) {
			System.out.println(word+":"+map.get(word));			
		}
		
		// Set : 순서 비유지, 원소중복허용안함
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(10);
		set.add(1);
		
		for (Integer s : set) {
			System.out.println(s);
		}
	}

}









