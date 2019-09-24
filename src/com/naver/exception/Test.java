package com.naver.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public void t1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해");
		int num = sc.nextInt();

		num=100/num;
		System.out.println(num);

	}
}
