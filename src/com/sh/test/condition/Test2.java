package com.sh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		Test2 t = new Test2();
		t.test();
	}

	public void test() {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("국어 점수 : ");
	int kor = sc.nextInt();
	
	System.out.println("영어 점수 : ");
	int eng = sc.nextInt();
	
	System.out.println("수학 점수 : ");
	int mat	= sc.nextInt();
	
	int sum = (kor + eng + mat);
	double average = sum/3;

	if( (kor>40 && eng>=40 && mat>=40) && (average >= 60) ) {
		System.out.println("합격");
			}

	else {
		System.out.println("불합격 ");
		
	}
	
	
		
	}
}
