package com.naver.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test", "t2.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file,true); //내용이 있다면 내용에 추가한다.

			boolean check = true;
			while(check) {
				System.out.println("저장할 내용을 입력하세요");
				String str = sc.next();
				//next : 스페이스바 전까지만 
				//nextline : 스페이스바 포함
				
				//내가 나갈수 있는 방법 : q나 Q를 입력하면 종료
				if(str.toLowerCase().equals("q")) {
					break;
				}
			
				fw.write(str+"\r\n"); //write메서드는 바로 이어서 받는다.
				//\r은 커서를 앞으로 보낸다. \n은 엔터와같은 효과
				fw.flush(); 
				//외부에서 데이터를 받아올때 버퍼라는 곳에 담겨서 들어온다.
				//반대로 내부에서 외부로 나갈때도 버퍼에 담겨서 나간다.
				//버퍼는 크기가 존재한다. 버퍼가 나갈때 꽉차야 나간다. 
				//다만 내가 쓴 글자가 버퍼를 꽉채우지 못하면 외부로 나갈 수 없다.
				//flush는 강제로 버퍼를 비우게 하여, 외부로 내 정보를 내보낼 수 있게 한다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

