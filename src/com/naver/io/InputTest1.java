package com.naver.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args)  {
		System.out.println("한글자입력");

		//스캐너없이 한글자 받기
		InputStream io = System.in; //바이트를 받는다.
		//1바이트씩 처리한다. 글자하나하면 2번처리해야한다. 

		InputStreamReader ir = new InputStreamReader(io); //char타입으로 바꿔준다.
		BufferedReader br = new BufferedReader(ir); //string타입으로 바꿔준다. 보조스트림 단독은 사용X

		//한글자씩 읽기
		/*
		try {
			int num = ir.read(); //예외가 발생할 수 있다. -> try catch문 필요
			char ch = (char)num;
			System.out.println(ch);
		} catch(Exception e) {
		}*/
		
		//문자 전부 읽기
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		


	}

}
