package com.sh.test.condition;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm) > ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg) > ");
		double weight = sc.nextDouble();
		
		double bmi = weight / ((height*0.01) * (height*0.01));
		System.out.println("BMI : " + bmi);
		
		if(bmi >= 30) {
			System.out.println("고도비만");
			
		}
		
		else if(bmi >= 25) {
			System.out.println("비만");
			
		}
		
		else if(bmi >= 23) {
			System.out.println("과체중");
			
		}
		
		else if (bmi >= 18.5) {
			System.out.println("정상");
		}
		
		else {
			System.out.println("저체중");
		}
		
	}	
		
}
	
	
	
	
	
	
	
	
	

