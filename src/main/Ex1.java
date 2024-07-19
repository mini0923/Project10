package main;

public class Ex1 {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없음!
//		Calc calc = new Calc();
		
		Calculator calc  = new Calculator();		
		int result = calc.add(10, 6);
		System.out.println(result);
		
		System.out.println(calc.substract(10, 6));
		System.out.println(calc.times(10, 6));
		System.out.println(calc.divide(10, 6));
		
	}

}

// 계산기 구현 클래스
class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1- num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
		
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}