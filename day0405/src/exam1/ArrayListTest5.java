package exam1;

import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

		list.add("µ·");
		list.add("°Ç°­");
		list.add("Çàº¹");
		list.add("»ç¶û");
		list.add("ÀÚ½Å");

		System.out.println(list);
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}

}
