package programmers;
//프로그래머스 모의고사


//1번 수포자 : 1,2,3,4,5 반복으로 찍음
//2번 수포자 : 2,1,2,3,2,4,2,5 반복
//3번 수포자 : 3,3,1,1,2,2,4,4,5,5 반복

//3명의 점수에서 최고점 뽑은 후 그 값과 같은 사람 체크
public class Exam {
	public static int[] solution(int[] answers) 
	{

		int max=0;
		int max_same_cnt = 0;
		int check = 0;

		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 점수 기록용
		int[] Score = { 0, 0, 0 };

		for (int i = 0; i < answers.length; i++) {
			if (one[i % 5] == answers[i])
				Score[0]++;
			if (two[i % 8] == answers[i])
				Score[1]++;
			if (three[i % 10] == answers[i])
				Score[2]++;
		}
		for (int i = 0; i < Score.length; i++) {
			if (max < Score[i])
				max = Score[i];
		}

		for (int i = 0; i < Score.length; i++) {
			if (max == Score[i]) {
				max_same_cnt++;
			}
		}

		int[] answer = new int[max_same_cnt];

		for (int i = 0; i < Score.length; i++) {
			if (max == Score[i]) {
				answer[check] = i+1;
				check++;
			}
		}

		return answer;
	}
	// 확인용
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		int[] ans = solution(a);
	}

}
