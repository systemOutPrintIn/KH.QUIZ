package com.sh.test.condition;

import java.util.Scanner;

public class Test4 {
	public static void main(String args) {
		Test4 t = new Test4();
		t.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
	
	System.out.print("1 ~ 10사이의 정수를 입력하세요.");
	int num = sc.nextInt();

	if(num >= 0 && num <= 10) {
		if(num % 2 == 0) {
			System.out.println("짝수");
			
		}

	else {
			System.out.println("홀수");
		}
	
	}	
		
	else { 
		System.out.println("1 ~ 10사이의 정수를 입력해야합니다.");
		
	}
		
		
		
	}
		
}	
	
	
	

