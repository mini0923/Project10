package main;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	// 키보드에서 값을 입력받는 스트림
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int num = scanner.nextInt();		// 숫자를 입력받는 메소드 호출
		
		System.out.println("숫자를 입력하신 숫자는 : " + num);
		
	}

}

