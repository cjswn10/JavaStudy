package exam01;

class SearchArray2 {

	public SearchArray2(int[] arr, int v) throws NotFoundException2 {

		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				System.out.println(v + "는 배열에 있습니다.");
				break;
			}
		}
		if (i == arr.length) {
			throw new NotFoundException2("배열에 " + v + "없습니다.");
		}

		/*
		 * 예외처리가 아닌 그냥 알려줌 if(i == arr.length) { System.out.println("배열에 " + v +
		 * "없습니다."); }
		 */
	}

}

class NotFoundException2 extends Exception {
	public NotFoundException2(String msg) {
		super(msg);
	}

}

public class SearchArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int v = 300;
		try {
			SearchArray2 s = new SearchArray2(arr, v);
		} catch (NotFoundException2 e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
