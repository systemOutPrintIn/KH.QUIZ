package com.sh.test;

import java.util.Scanner;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		
	
	}


	public void RPC() {
		
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("=== 가위 바위 보 게임 ===");
		
		System.out.println("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		
		int a = sc.nextInt();
		
		System.out.println("======== 결과 =======");
		
		if(a==1) {
			System.out.println("당신은 가위를 냈습니다.");
		}
		
		else if(a==2) {
			System.out.println("당신은 바위를 냈습니다.");
		}
		
		else {
			System.out.println("당신은 보를 냈습니다.");
		}
		
		if (com==1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}
		
		else if(com==2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}
		
		else {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		System.out.println("==================");
		
		
		if( (a==1 && com==3 || (a==2 && com==1)) || (a==3 && com==2)) {
			System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
			
		}
		
		else if ( (a==1 && com ==1) || (a==2 && com==2) || (a==3 && com ==3)) {
			System.out.println("비겼습니다.");
		}
	
		else {
			System.out.println("당신이 졌습니다.ㅋ.ㅋ");
		
		}
	}
	


	public void random() {

	int num1 = (int)(Math.random()*10);
	
	int num2 = (int)(Math.random()*10)+1;
	
	Random rnd = new Random();
	int num3 = rnd.nextInt(16)+20;
	
	int num4 = (int)(Math.random()*2);
	
	System.out.println(num3);
	
	}
	
}
			
			
			
			