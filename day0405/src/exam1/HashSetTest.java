package exam1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우리반이 좋아하는 과일이름들을 저장하고자 한다.
		HashSet names = new HashSet();
		
		names.add("사과");
		names.add("딸기");
		names.add("바나나");
		names.add("파인애플");
		boolean a = names.add("복숭아");
		boolean b = names.add("딸기");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(names);
	}

}
