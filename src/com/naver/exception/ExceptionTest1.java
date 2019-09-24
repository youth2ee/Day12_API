package com.naver.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age=0;
		
		System.out.println("나이");
		
		try{
		age = sc.nextInt();
		//throw new InputMismatchException(); //예외때 발생하는 숨어있는 코드 : 던진다
		
		age = 5/age;
		//throw new ArithmeticException(); //예외때 발생하는 숨어있는 코드 : 던진다
		} catch (Exception e) {
			e.printStackTrace(); //오류의 이유를 프린트 해준다.
		}
		
		//catch (InputMismatchException i){ //던진거를 매개변수로 받자 
			//System.out.println("숫자만 입력하세요");
		//} catch (ArithmeticException a) {
			//System.out.println("0으로 나눌 수 없습니다");
		//}
		//어떤 오류인지 몰라 각각의 catch문을 만들 수 없을때,
		//매개변수로 (Exception i)나 (Throwable i)를 넣어줘도 된다.
		
		
		
		
		System.out.println(age);
		//cf. instanceof : age가 String타입이라면

}

	}


