package com.sh.var;

import java.util.Scanner;	

public class Example {

		public void example1() {
			
			int a = 30;
			int b = 10;
			
			System.out.println("더하기결과 :"+(a + b));
			System.out.println("빼기결과 :"+ (a - b));
			System.out.println("곱하기결과:"+(a * b));
			System.out.println("나누기한몫"+(a / b));
			System.out.println("나누기한나머지"+(a % b));
		}

		public void example2() {
			
			float wid;
			float hei;
			
			wid = 15.5F;
			hei = 50.5F;
			
			float surface;
			float circum;
			
			surface = wid * hei ;
			circum = (wid* hei) * 2 ;
			
			System.out.printf("면적 : %.1f\n",surface);
			System.out.printf("둘레 : %.1f\n",circum);
			
		}
		
		public void example3() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("문자열(3글자이상)을 입력하시오 : clock");
			
			char a = sc.next().charAt(0);
			System.out.printf("첫번째 문자%c",a);
			
			char b = sc.next().charAt(1);
			System.out.printf("두번째 문자%c",b);
			
			char c = sc.next().charAt(2);
			System.out.printf("세번째 문자%c",c);
			
			
		}
		
}
	
	

