package programmers;

//로또 최고순위와 최저 순위

/*
 * 0 의 개수에 따라 다르다
 * 0의 개수가
 * :
 * 
 *  0개 -> 그값이 최저이자 최고
 *  1개 -> 1,
 *  2개 -> 1,6
 * 
 */

public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums)
	{
		int answer[] = new int[2];
		int n = 0 ;
		int zero =0;
		
		// 0의 개수를 세줌
		for(int i=0;i<lottos.length;i++)
		{
			if(lottos[i] == 0) zero++;
		}
		
		for(int i = 0 ; i<lottos.length;i++)
		{
			if(lottos[i] == win_nums[i]) n++;
		}
		answer[0] = n+zero;
		answer[1] = n;
		
		return answer;
	}
	
	
	public static void main(String[] args)
	{
		int[] lotto = {44,1,0,0,31,25};
		int[] win_lotos = {31,10,45,1,6,19};
	}

}
