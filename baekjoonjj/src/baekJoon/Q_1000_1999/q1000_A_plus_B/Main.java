package baekJoon.Q_1000_1999.q1000_A_plus_B;

import java.util.Scanner;

/*
 * 
A+B
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	128 MB	153890	68592	51236	46.138%
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A+B를 출력한다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
	}
}
