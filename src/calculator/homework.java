package calculator;
import java.util.Scanner;
public class homework {

	public static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번째 입력 값 : ");		
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	public static int getSecondValue(Scanner scanner) {
		System.out.println("두 번째 입력 값 : ");		
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	public static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 입력 : ");		
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	public static int calculate(String symbol, int first, int second) {
		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.println("더하기 :" + result);
		} else if(symbol.equals("-")) {
			result = first - second;
			System.out.println("빼기 : " + result);
		} else if(symbol.equals("/")) {
			result = first / second;
			System.out.println("나누기 : " + result);
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.println("곱하기 : " + result);
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int first = getFirstValue(scanner);
		int result = first;
		while(true) {
			String symbol = getSymbol(scanner);
			if(symbol.equals("quit")) {
				System.out.println("최종 결과 값 : " + result);
				break;
			}
			int second = getSecondValue(scanner);
			
			result = calculate(symbol, result, second);
			//System.out.println("결과는 : " + result);
		}
	}

}
