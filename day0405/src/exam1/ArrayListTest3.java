package exam1;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add("체리");
		list.add("망고");
		list.add("멜론");
		list.add("사과");
		list.add("수박");
		list.add("수박");
		list.add("망고");

		System.out.println(list);
		
//		String obj = (String)list.remove(100);	오류
		
		
		boolean f = list.remove("수박");
		System.out.println(list);
		System.out.println(f);
	
	}

}
