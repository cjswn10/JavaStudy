package exam01;

class SearchArray {

	public SearchArray(int[] arr, int v) {
		//메소드 안에서 예외처리
		try {
			int i;
			for (i = 0; i < arr.length; i++) {
				if (arr[i] == v) {
					System.out.println(v + "는 배열에 있습니다.");
					break;
				}
			}
			if (i == arr.length) {
				throw new NotFoundException("배열에 " + v + "없습니다.");
			}
		} catch (NotFoundException e) {
			System.out.println("예외발생: " + e.getMessage());
		}

		/* 예외처리가 아닌 그냥 알려줌
		 * if(i == arr.length) { System.out.println("배열에 " + v + "없습니다."); }
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
