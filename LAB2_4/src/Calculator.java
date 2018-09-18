public enum Calculator {
	FACTORIAL(1),
	FIBONACCI(2),
	POWER(3),
	GCD(4),
	HANOI(5);
	//필요하다면 Enum 상수에 특정 값을 명시 할 수 있습니다. 
	//다만 이 경우 생성자와 멤버변수를 작성해주어야 합니다.
	//생성자는 private으로 작성해주어야 합니다.
	
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
