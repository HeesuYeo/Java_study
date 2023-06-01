/*
  	배열 안에 배열을 넣을 수 있다
  	(배열로 이루어진 배열을 만들 수 있다)
 
 */
public class B15_Array2 {

	public static void main(String[] args) {
		String[] amimals = {"abc", "lion" , "tiger","..."};
		int [] lotto = {1,3,9,84,0x123};
		//int [] numbers = {1,3,'안녕하세요',84,0x123}; int는 int만 
		int [] numbers = {1,3,'9',84,0x123}; //char은 가능 여지가 있으므로
		
		int [][] arr2 = {
				lotto, 
				lotto,
				{1,2,3,4,5},
				{'a','3','b','가','힣'},
				{3,3,3,3}
		};
		// arr2[0],arr2[1],lotto 은 모두 같은 배열을 가리키고있다 
		System.out.println(arr2[0][4]);
		System.out.println(arr2[1][2]);
		System.out.println(arr2[1][3]);
		System.out.println(arr2[1][4]);
		//arr2 arr2[0][2]를 변경 시켜도 다른 모든 배열의 값이 변함
		arr2[0][2] = 7;
		
		System.out.println(arr2[1][2]);
		System.out.println(lotto[2]);
		
		
		//n차원 배열은 n중 반복문으로 모두 탐색할수있다
		
		// arr2.length : 배열이 몇 개 있는지를 의미함
		for (int i = 0; i < arr2.length; ++i) {	

			//arr2[i].length : 내부의 있는 i번재 배열의 길이를 의미함
			for (int j = 0; j < arr2[i].length; ++j) {
				System.out.printf("arr2[%d][%d] == %d\n",
						i, j, arr2[i][j]);
			}	
		}
	}
}