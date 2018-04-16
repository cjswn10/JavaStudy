package exam1;

import java.util.ArrayList;

public class ArrayListTest2 {

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
	
		String removed = (String)list.remove(2);	//Object형으로 반환하기 때문에 Object의 자식인 String으로 캐스팅 가능
		System.out.println(removed);
		System.out.println(list);
	}

}
