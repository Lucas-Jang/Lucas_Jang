/////////////////
//�����(180918)
//�ڹ����α׷���2_LAB2_4
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
			System.out.println("�Ǻ���ġ ������ '" + a + " '��° ���� = " + result);
			break;
		case HANOI :
			result = Utility.hanoi(a);
			System.out.println("�ϳ��� Ÿ�� : ��� ������ " + a + "�� �� �̵� Ƚ�� = " + result);
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
			System.out.println(tmp[0] + "��" + tmp[1] + "���� = " + result);
			break;
		case GCD : 
			result = Utility.gcd(tmp[0],tmp[1]);
			System.out.println(tmp[0] + "��" + tmp[1] + "�� �ִ����� = " + result);
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
