package com.sh.test.array;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}

	public void test() {
		String[] fruits = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		for (int i = 0; i < fruits.length; i++) {
			
			if (fruits[i].equals("바나나"))
				System.out.println("fruits[" + i + "] = " + fruits[i]);
			
			
		}
		
	}
	
}
