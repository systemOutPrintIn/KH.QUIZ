package practice1;

public class practice1 {

1. 연산자 우선순위를 괄호로 표현하기
	
x = 3 + 4 + 5;

x = y = z;

z *= ++y + 5;

a || b && c || d;

-----------------------

x = ((3 + 4)) + 5);

((x = y) = z);

((z *= (++y)) + 5;

((a || b) && (c || d);




2. 처리과정을 표현하기 

1 (true && true) || false

   true || false -> true
   
  

2 (false && true) || true

   false || true -> true

3 (false && true) || false || true

  (false || false ) || true - >
   
   false || true -> true


4 (5 > 6 || 4 > 3)&& (7 > 8)

   (false || 4 > 3) && (7 > 8)
   
   (false || true) && (7 > 8))

   true && (7 > 8) - > true && false -> false
   
   
5 !(7 > 6 || 3 > 4)

  !(true || 3 > 4) -> !(true) - > false

	
	
	
	
	
	
}
