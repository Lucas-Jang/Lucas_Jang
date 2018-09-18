
public class Utility {
	//2.���丮��
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return (n * factorial(n-1));
		}
	}
	//3.�Ǻ���ġ
	public static int fibonacci(int n) {
		if(n ==0) return 0;
		if(n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	//4. ����
	public static int power(int a, int b) {
		if(b == 0) return 1;
		else return a*power(a, b-1);
	}
	//5.�ִ�����
	public static int gcd(int a, int b) {
		if(b==0) 
			return a;
		else
			return gcd(b, a%b);
		
	}
	//6. ���� ���ϴ� ��� ȣ�� �޼ҵ� : �ϳ���
	public static int hanoi(int a) {
		if(a ==1)
			return 1;
		else if(a>0)
			return (2*hanoi(a-1) + 1);
		else
			System.out.println("Error!");
			return 0;
	}
	
	//int ���� 2�������� ������ִ� �޼ҵ嵵 ��ͷ� ���� ����
	//decimal to recursive binary
	//devide and conquer ����� more effective �� power method
}
