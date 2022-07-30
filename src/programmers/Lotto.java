package programmers;

import java.util.Arrays;

//로또 최고순위와 최저 순위

/*
 * 0 의 개수에 따라 다르다
 * 
 * 
 * 
 * 
 */

public class Lotto {
	   public static int num(int n)
	    {
	        if(n == 6) return 1;
	        else if(n == 5) return 2;
	        else if(n == 4) return 3;
	        else if(n == 3) return 4;
	        else if(n == 2) return 5;
	        else if(n == 1) return 6;
	        else if(n == 0) return 6;
	        
	        return n;
	    }
	public static int[] solution(int[] lottos, int[] win_nums)
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
			for(int j = 0 ; j<win_nums.length;j++)
			if(lottos[i] == win_nums[j]) n++;
		}
		answer[0] = num(n+zero);
		answer[1] = num(n);
		System.out.println(Arrays.toString(answer));
		return answer;
	}
	
	
	public static void main(String[] args)
	{
		int[] lotto = {44,1,0,0,31,25};
		int[] win_lotos = {31,10,45,1,6,19};
		
		int[] ans = solution(lotto,win_lotos);
	}

}
