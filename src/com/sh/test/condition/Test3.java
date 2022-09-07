package com.sh.test.condition;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.test();
	}

	public void test() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 두개와 연산자(+, -, *, /)를 입력하세요.");
	
	int num1 = 0;
	int num2 = 0;
	char opr = ' ';

	System.out.print("정수1을 입력하세요 : ");
	num1 = sc.nextInt();
	
	if (num1 >= 0) {
		System.out.print("정수2를 입력하세요 : ");
		num2 = sc.nextInt();
		
		if (num2 >= 0) {
			System.out.print("연산자(+, -, *, /)를 입력하세요 : ");
			opr = sc.next().charAt(0);
			
			if (opr == '+') {
				System.out.printf("입력하신 정보는 %d, %d, %s 입니다.\n", num1, num2, opr);
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			} 
			else if (opr == '-') {
				System.out.printf("입력하신 정보는 %d, %d, %s 입니다.\n", num1, num2, opr);
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			}
			else if (opr == '*') {
				System.out.printf("입력하신 정보는 %d, %d, %s 입니다.\n", num1, num2, opr);
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			}
			else if (opr == '/') {
				System.out.printf("입력하신 정보는 %d, %d, %s 입니다.\n", num1, num2, opr);
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			} else if (opr != '+' || opr != '-' || opr != '*' || opr != '/') {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		} 
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	} 
	else {
		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
	}
	
	}	
}