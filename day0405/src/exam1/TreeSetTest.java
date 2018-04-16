package exam1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동으로 정렬해줌
		TreeSet names = new TreeSet();
		
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
