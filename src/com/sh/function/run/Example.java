package com.sh.function.run;

import java.util.Scanner;

public class Example {
	
	public void opSample3() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("정수를 입력하세요.");
		
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수다.": "음수다.");
		
	}
	
	public void opSample4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		String even = "짝수다.";
		String odd = "홀수다.";
		
		String a = (num % 2 == 0) ? even : odd;
		
		System.out.println(a);
	
	}
	

	
}
