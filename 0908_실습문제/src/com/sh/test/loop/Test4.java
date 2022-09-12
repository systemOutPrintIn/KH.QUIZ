package com.sh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Test4 t4 = new Test4();
		t4.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		boolean apl = false;
		
		for (int a = 0; a < str.length(); a++) {
			
			if(str.charAt(a) > 96 && str.charAt(a) < 123
					|| str.charAt(a) > 64 && str.charAt(a) < 91); }
		apl = true;
		}
	
	  	else  { 
	  	
	  		boolean apl = false;
	}

	  	if (apl == false) {
	  		System.out.println("영문자가 아닙니다.");
	  		
	  	}
	  	else { 
	  			System.out.print("문자 입력 : ");
	  			char ch = sc.next().charAt(0);
	  			
	  			int num = 0;
	  			
	  			for (int a = 0; a < str.length();a++) {
	  				
	  				if(str.charAt(a) == ch) {
	  					num++;
	  					 				
	  				}
	  				
	  			}
	  			System.out.println("포함된 갯수 : " + num);
	  	}
	  	
}
}
