package exam1;

import java.util.Random;
import java.util.TreeSet;

public class lottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		TreeSet lotto = new TreeSet();
/*
		int count = 0;
		while(count < 6) {
			if(lotto.add(r.nextInt(45)+1))
				count++;
		}
*/
		while(lotto.size() < 6)
			lotto.add(r.nextInt(45)+1);
		
		
		System.out.println("�̹��� �ζ� ��ȣ");
		System.out.println(lotto);
	}

}
