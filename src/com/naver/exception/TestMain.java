package com.naver.exception;

public class TestMain {

	public static void main(String[] args) {
		
		Test test = new Test();
		
		//test클래스에서 예외 생기면 메인에서 받는다.
		try {
			test.t1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
