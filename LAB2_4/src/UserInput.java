import java.util.Scanner;

public class UserInput {
	static Scanner scan = null;
	public static int getUserInteger() {
		scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String line = scan.nextLine();
		int value = Integer.parseInt(line);
		return value;
	}
	public static int[] getUserTwoIntegers() {
		scan = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int value1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int value2 = scan.nextInt();
		int[] tmp = {value1,value2};
		scan.nextLine();	//개행문자를 입력받아서 버퍼에 \n이 들어가있는 것 방지하기
		return tmp;
	}

	public static Calculator getCalculatorMode() {
		scan = new Scanner(System.in);
		System.out.print("모드 입력[1.FACTORIAL 2.FIBONACCI 3.POWER 4.GCD 5.HANOI] : ");
		String line = scan.nextLine();
		return Calculator.modeOf(line);
	}
	
	public static boolean getExitKey() {
		System.out.print("q를 눌러 프로그램을 중단시키거나 Enter를 눌러 계속하기 : ");
		String line = scan.nextLine();
        if (line.contentEquals("q")) {
        	System.out.println("프로그램 종료!");//.contentsEquals() 대신 line =="q"라고 해도 된다.
            return false;
        }
        else
        	return true;
	}
}
