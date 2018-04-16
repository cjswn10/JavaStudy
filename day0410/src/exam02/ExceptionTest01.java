package exam02;

/*
 * RuntimeException의 후손들은 사용자가 특별히 예외처리 하지 않아도 된다!!
 * 그 이외의 모든 예외는 반드시 사용자가 예외처리를 해야한다!!
*/
class MyException extends Exception {
	public MyException(String msg)
	{
		super(msg);
	}
}

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new ArrayIndexOutOfBoundsException();
	}

}
