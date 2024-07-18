package main;

public class Quiz1 {

	public static void main(String[] args) {

		Calc calc = new Calculator();
		
		if (calc instanceof Calculator) {
			Calculator c = (Calculator) calc;
			c.showInfo();
			
		}
			
		
		
	}

}
