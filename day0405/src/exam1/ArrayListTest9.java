package exam1;
//�ڹ� �ʱ⿡ �÷��� �����ӿ�ũ�� � �ڷ����̴��� ��� ���� ���� �ٷθ� �˾Ҵ�.
//�׷��� ������ �����͸� ó���Ϸ��� �ߴ��� �ᱹ, ���� type���� casting�ؾ� �ϴ�
//���� ���� �ƴϴ���.
//jdk 1.4���Ŀ� �÷��� �����ӿ�ũ�� �� ���� ���� ������ Ÿ���� �����ؼ� ���ڰ� �����Ѵ�.
//			=============>���׸�
import java.util.ArrayList;

public class ArrayListTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(28);
		list.add(27);
		list.add(27);
//		list.add("26");		ERROR��
		list.add(25);
		list.add(20);
		list.add(28);
		
		int tot = 0;
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i);	//casting�� �ʿ� ����!!
			tot += n;
		}
		
		int avg = tot/list.size();
		
		System.out.println("��ճ���: " + avg);
		
	}

}
