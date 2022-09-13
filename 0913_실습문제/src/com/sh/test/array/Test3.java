package com.sh.test.array;

import java.util.Scanner;

public class Test3 {

		public static void main(String[] args) {
			
			Test3 t3 = new Test3();
			t3.test();
		
		}

		public void test() {
						
			Scanner sc = new Scanner(System.in);
			
			System.out.println("문자열 하나 입력 후 문자를 검색하면 문자 갯수 출력");
			
			System.out.print("입력값 : ");
			
			String str = sc.next();
			
			System.out.print("검색값 : ");
			
			char ch = sc.next().charAt(0);
			
			int cnt = 0;
			
			for (int i = 0; i < str.length(); i++) {
				
				if (ch == str.charAt(i)) {
					
					cnt++;
			}
			
			System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c는 %d개 입니다." , str, ch, cnt);
			
			
			
			
			}
		
			
		}
	
}
