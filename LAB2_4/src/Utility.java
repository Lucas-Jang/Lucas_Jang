
public class Utility {
	//2.팩토리얼
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return (n * factorial(n-1));
		}
	}
	//3.피보나치
	public static int fibonacci(int n) {
		if(n ==0) return 0;
		if(n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	//4. 제곱
	public static int power(int a, int b) {
		if(b == 0) return 1;
		else return a*power(a, b-1);
	}
	//5.최대공약수
	public static int gcd(int a, int b) {
		if(b==0) 
			return a;
		else
			return gcd(b, a%b);
		
	}
	//6. 내가 원하는 재귀 호출 메소드 : 하노이
	public static int hanoi(int a) {
		if(a ==1)
			return 1;
		else if(a>0)
			return (2*hanoi(a-1) + 1);
		else
			System.out.println("Error!");
			return 0;
	}
	
	//int 숫자 2진법으로 만들어주는 메소드도 재귀로 구현 가능
	//decimal to recursive binary
	//devide and conquer 방식의 more effective 한 power method
}
