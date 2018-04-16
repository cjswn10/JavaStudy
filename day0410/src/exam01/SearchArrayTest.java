package exam01;

class SearchArray {

	public SearchArray(int[] arr, int v) {
		//�޼ҵ� �ȿ��� ����ó��
		try {
			int i;
			for (i = 0; i < arr.length; i++) {
				if (arr[i] == v) {
					System.out.println(v + "�� �迭�� �ֽ��ϴ�.");
					break;
				}
			}
			if (i == arr.length) {
				throw new NotFoundException("�迭�� " + v + "�����ϴ�.");
			}
		} catch (NotFoundException e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

		/* ����ó���� �ƴ� �׳� �˷���
		 * if(i == arr.length) { System.out.println("�迭�� " + v + "�����ϴ�."); }
		 */
	}

}

class NotFoundException extends Exception {
	public NotFoundException(String msg) {
		super(msg);
	}

}

public class SearchArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int v = 300;

		SearchArray s = new SearchArray(arr, v);

	}

}
