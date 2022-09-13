package com.sh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
	
	Test2 t2 = new Test2();
	t2.test();

}

	public void test() {
		
		int x = (int)(Math.random()*100)+1;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. => ");
		
		int num = sc.nextInt();
		
		int count = 1;
		while (x!= num) {
			
			if (x < num) {
				System.out.println("난수는 입력하신 정수보다 작습니다.");
				System.out.print("정수를 입력하세요 > ");
				num = sc.nextInt();
			}
		
			else if (x > num) {
				System.out.println("난수는 입력하신 정수보다 큽니다.");
				System.out.print("정수를 입력하세요 > ");
				num = sc.nextInt();
			}
			
			count++;
		}
		System.out.printf("정답입니다. %d회만에 정답을 맞추셨습니다." ,count );
	
	}
	
	}	