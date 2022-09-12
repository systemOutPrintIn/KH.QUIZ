package com.sh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num < 10) {
			for (int a = 0; a < 10; a++) {
				System.out.printf("%d X %d = %d\n",num,a,num*a);
			
			}
		}
			else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
	}
}
		
	

