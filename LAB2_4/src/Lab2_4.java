/////////////////
//장원준(180918)
//자바프로그래밍2_LAB2_4
////////////////
 
public class Lab2_4 {
	public static void printResult(Calculator m, int a) {
		int result;
		switch(m) {
		case FACTORIAL : 
			result = Utility.factorial(a);
			System.out.println(a + "! = " + result);
			break;
		case FIBONACCI :
			result = Utility.fibonacci(a);
			System.out.println("피보나치 수열의 '" + a + " '번째 항은 = " + result);
			break;
		case HANOI :
			result = Utility.hanoi(a);
			System.out.println("하노이 타워 : 블록 개수가 " + a + "일 때 이동 횟수 = " + result);
			break;
		default : break;
		}
	}
	//Overloading
	public static void printResult(Calculator m, int[] tmp) {
		int result;
		switch(m) {
		case POWER :
			result = Utility.power(tmp[0],tmp[1]);
			System.out.println(tmp[0] + "의" + tmp[1] + "제곱 = " + result);
			break;
		case GCD : 
			result = Utility.gcd(tmp[0],tmp[1]);
			System.out.println(tmp[0] + "과" + tmp[1] + "의 최대공약수 = " + result);
			break;
		default : break;
		}
	}
	
	//main
	
	public static void main(String[] args) {
		int value;
		int[] values = new int[2];

		do {
			Calculator m = UserInput.getCalculatorMode();
			switch(m) {
			case FACTORIAL :
			case FIBONACCI :
			case HANOI :
				value = UserInput.getUserInteger();
				printResult(m, value);
				break;
			case POWER :
			case GCD :
				values = UserInput.getUserTwoIntegers();
				printResult(m, values);
				break;
			default : break;
				
			}
		}while(UserInput.getExitKey());
		
	}

}
