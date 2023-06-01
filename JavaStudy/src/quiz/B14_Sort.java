/*
 	랜덤 int 30개가 들어있는 배열을 생성한 후
 	
 	(1) 해당 배열의 내용을 작은 값 부터 차례대로 (오름차순) 저장한 
 		새로운 배열을 생성하여 출력해보세요
 	
 	(2) 해당 배열의 내용을 큰 값 부터 차레대로(내림차순) 저장한 
 		새로운 배열을 생성하여 출력해보세요
 */
package quiz;

import java.util.Arrays;
import java.util.Random;

public class B14_Sort {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] nums = new int[30];
		
		//Arrays.fill(arr, value) : 해당 배열을 원하는 값으로 가득 채울때 사용
		//Arrays.fill(nums,100);
		
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = (int)(Math.random() * 1000 - 500); 
		}
		int [] ascending = new int [30];
		// 배열의 시작 주소 전달 -> 두 배열 변수가 같은 배열을 가리키게 된다 
		//ascending = nums;
		
		//배열 내부의 값 복사
		for (int i =0; i < nums.length; ++i)	{
			ascending[i] = nums[i];
		}
		// 최대값을 구한다 : {,1,2,3,4,5,6,7,8,9}
		// 이런식으로 풀이할 예정
		// i : 내가 제일 큰 값을 찾아서 넣어야 하는 위치

		for (int i = 29; i >= 0; --i) {
			//제일 큰값 찾기 
			//{1.2.3.4.5.6.7.8.9} 
			
			//제일 큰 값의 위치를 찾는곳
			int max_index = 0;
			for (int j = 1; j<= i; ++j) {
				if(ascending [max_index] < ascending[j]) {
					max_index = j;
				}		
			}	
					
					for (int j = 1; j<= i; ++j) {
						if(ascending [max_index] <  ascending[j]) {
							max_index = j;
				}		
			}
			//찾은 가장 큰 값과 마지막 위치의 값을 교환
			int temp =  ascending[i];
			ascending[i] = ascending[max_index];
			ascending[max_index] = temp;
					
		}
		
		// 숙제
	
		System.out.println("정렬 전 " + Arrays.toString(nums));
		System.out.println("오름 차순 " + Arrays.toString(ascending));
		
		
		for (int a = 0; a < nums.length; ++a) {
			nums[a] = (int)(Math.random() * 1000 - 500); 
		}
		int [] descending = new int [30];
		
		
		for (int a =0; a < nums.length; ++a)	{
			descending[a] = nums[a];
		}
		

		for (int a = 29; a >= 0; --a) {
			
			int min_index = 0;
			for (int b = 1; b<= a; ++b) {
				if(descending [min_index] > descending[b]) {//작은놈 찾기
					min_index = b;
				}		
			}	
					
					for (int b = 1; b<= a; ++b) {
						if(descending [min_index] >  descending[b]) {
							min_index = b;
				}		
			}
			
			int temp1 =  descending[a];
			descending[a] = descending[min_index];
			descending[min_index] = temp1;
					
		}
		System.out.println("내림 차순 " + Arrays.toString(descending));
	}
}
		