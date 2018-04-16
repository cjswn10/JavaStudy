package exam01;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		//예외가 발생할 상황이 아니지만 강제로 예외를 발생시킬 수 있다.
		//throw 사용
		throw new ArrayIndexOutOfBoundsException();
		

	}

}
