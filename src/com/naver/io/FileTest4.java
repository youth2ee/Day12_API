package com.naver.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		File file = new File("c:\\test","names.txt");
		FileReader fr=null;
		BufferedReader br=null;
		
		//파일의 내용을 읽어오기
		try {
			fr = new FileReader(file);  //파일경로를 읽겠다.
			br = new BufferedReader(fr); //char로 받겠다?
			
			boolean check =true;
			while(check) {
				String str = br.readLine();  //한줄씩 받겠다.
				if(str==null) { 
					//엔터키들어있는 것은 null아니다.
					//키보드로 이동가능한 곳은 null아니다.
					break; 
				}
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //사용이 끝나면 연결을 해제해줘야 한다.
			//예외가 발생하든 발생하지 않든 연결해제한다.
			//해제순서 : 연결된 역순으로
			
			try { //연결해제 메서드 close
				br.close();
				fr.close();
				sc.close(); //스캐너도 마지막에 연결해제해줘야한다.
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		

	}

}
