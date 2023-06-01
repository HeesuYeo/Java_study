	/*1. 1부터 30까지 한 줄에 숫자 5개식 출력
 	2. 1부터 200까지의 수중 2의배수도 아니고 3의 배수도 아닌 수들의 총합을 출력
*/


package quiz;

public class B11_Continue {

	public static void main(String[] args) {
		
		int i = 1;

		while (i <= 30) {
			System.out.printf("%d ", i);
			if (i % 5 == 0) {
				System.out.print("\n");
			}
			++i;
			/*
			 
			 int num 1;
			 while (num<= 30) {
			 System.out.print(num + "\t");
			 if (i % 5 != 1) {
			 continue;
			} 
			  System.out.println();
			  }
			   System.out.println(num);
			 */
		}
		
		int sum = 0;
		int w = 1;

		while (w <= 200) {
			if (w % 2 != 0 && w % 3 != 0) {
				sum += w;

			}
			++w;

		}
		System.out.println("결과 : " + sum);

	}
	 
	
}

/*
2번
int sum = 0;
num = 1;

while (num<= 200) {
System.out.println(num);

if(w % 2 != 0 && w % 3 != 0) {
sum += num;

}

 }
  System.out.println(sum);
  
  //// while 문에서 중요한것은 증감 값의 위치에 따라
    숫자가 몇부터 몇가지 반복될지 정확하게 아는것\
  ex)  
  int i =0;
  
  while (i++ < 10) {
   System.out.println(i);
  
  //앞에다가 하는것은  10이지만 9번 반복하므로
  int i =0;
  
  while (++i < 10) { 별로다
   System.out.println(i++);
  
  
  int i =0;
  
  while (i < 10) {
  ++i;
   System.out.println(i);
  
*/
