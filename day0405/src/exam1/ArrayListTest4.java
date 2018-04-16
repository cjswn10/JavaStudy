package exam1;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

		list.add("µ·");
		list.add("°Ç°­");
		list.add("Çàº¹");
		list.add("»ç¶û");
		list.add("ÀÚ½Å");

		for(Object str: list)
			System.out.println(str);
	}

}
