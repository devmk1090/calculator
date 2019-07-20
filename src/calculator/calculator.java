package calculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println("더하기 : " + (first+second));
		System.out.println("빼기 : " + (first-second));
		System.out.println("나누기 : " + (first/second));
		System.out.println("곱하기 : " + (first*second));
		
	}

}
