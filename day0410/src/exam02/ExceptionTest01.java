package exam02;

/*
 * RuntimeException�� �ļյ��� ����ڰ� Ư���� ����ó�� ���� �ʾƵ� �ȴ�!!
 * �� �̿��� ��� ���ܴ� �ݵ�� ����ڰ� ����ó���� �ؾ��Ѵ�!!
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
