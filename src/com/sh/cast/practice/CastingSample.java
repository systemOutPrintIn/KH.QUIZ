package com.sh.cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자입력:");
		char ch = sc.next().charAt(0);
		System.out.printf(ch + "is unicode" + (int)ch);
	
	}
	
	
     public void calculatorScore() { 
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println();
		
		 System.out.println("국어 :");
		 double a = sc.nextDouble();
		
		 System.out.println("영어 :");
		 double b = sc.nextDouble();
		
		 System.out.println("수학 :");
		 double c = sc.nextDouble();
		
		 int d = (int)(a + b + c);
		 int f = d/3;
				
		 System.out.printf("총점 : %d\n", d);
		 System.out.printf("평균 : %d",f);
		
		
	}
	
}
