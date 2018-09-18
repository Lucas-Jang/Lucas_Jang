import java.util.Scanner;

public class UserInput {
	static Scanner scan = null;
	public static int getUserInteger() {
		scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String line = scan.nextLine();
		int value = Integer.parseInt(line);
		return value;
	}
	public static int[] getUserTwoIntegers() {
		scan = new Scanner(System.in);
		System.out.print("����1 �Է� : ");
		int value1 = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int value2 = scan.nextInt();
		int[] tmp = {value1,value2};
		scan.nextLine();	//���๮�ڸ� �Է¹޾Ƽ� ���ۿ� \n�� ���ִ� �� �����ϱ�
		return tmp;
	}

	public static Calculator getCalculatorMode() {
		scan = new Scanner(System.in);
		System.out.print("��� �Է�[1.FACTORIAL 2.FIBONACCI 3.POWER 4.GCD 5.HANOI] : ");
		String line = scan.nextLine();
		return Calculator.modeOf(line);
	}
	
	public static boolean getExitKey() {
		System.out.print("q�� ���� ���α׷��� �ߴܽ�Ű�ų� Enter�� ���� ����ϱ� : ");
		String line = scan.nextLine();
        if (line.contentEquals("q")) {
        	System.out.println("���α׷� ����!");//.contentsEquals() ��� line =="q"��� �ص� �ȴ�.
            return false;
        }
        else
        	return true;
	}
}
