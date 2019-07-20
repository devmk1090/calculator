package calculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.println("사칙연산 : ");
		String third = scanner.next();
		System.out.println(third);
		
		System.out.println("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		if (third.contentEquals("+")) {
			System.out.println("더하기 :" + (first+second));
		} else if(third.contentEquals("-")) {
			System.out.println("빼기 : " + (first-second));
		} else if(third.contentEquals("/")) {
			System.out.println("나누기 : " + (first/second));
		} else if (third.contentEquals("*")) {
			System.out.println("곱하기 : " + (first*second));
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
	}
}
