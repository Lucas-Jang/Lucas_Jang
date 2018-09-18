public enum Calculator {
	FACTORIAL(1),
	FIBONACCI(2),
	POWER(3),
	GCD(4),
	HANOI(5);
	//�ʿ��ϴٸ� Enum ����� Ư�� ���� ��� �� �� �ֽ��ϴ�. 
	//�ٸ� �� ��� �����ڿ� ��������� �ۼ����־�� �մϴ�.
	//�����ڴ� private���� �ۼ����־�� �մϴ�.
	
	private final int mode;
	private Calculator(int mode) {
		this.mode = mode;
	}

	public static Calculator modeOf(String name) {
		switch (name) { 
		case "1":
		case "FACTORIAL":
			return FACTORIAL;
		case "2":
		case "FIBONACCI":
			return FIBONACCI;
		case "3":
		case "POWER":
			return POWER;
		case "4":
		case "GCD":
			return GCD;
		case "5":
		case "HANOI":
			return HANOI;
		default :
			return null;
		}
		
	}
}
