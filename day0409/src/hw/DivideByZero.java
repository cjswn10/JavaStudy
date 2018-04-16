package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, result;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("첫 번째 정수: ");
			number1 = sc.nextInt();

			System.out.println("두 번째 정수: ");
			number2 = sc.nextInt();

			result = number1 / number2;
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("올바른 두 수를 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("작업종료");
		}

	}

}
