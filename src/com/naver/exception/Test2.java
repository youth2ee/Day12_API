package com.naver.exception;

public class Test2 {

	public void cal(int n1, int n2) throws Exception {
		//유치원 4살
		//100단위 이상은 못센다.
		
		int n3 = n1+n2;//예외가 발생할 여지가 없지만 강제로 exception을 강제로 발생시키기
		//1.
		if(n3>99) {
			throw new Myexception(); //나의 exception
		}
		
		System.out.println(n3);
		
	}
	
}
