package com.naver.io;

import java.io.File;


public class FileTest1 {

	public static void main(String[] args) {

		File f = new File("C:\\test"); // \를 2개 넣어줘야 한다. /t는 탭이라는 의미이므로
		System.out.println(f.exists()); //존재하면 true
		System.out.println(f.isFile()); //이 경로에 있는 얘가  파일이냐  ->파일이면 true, 아니면 false //false
		System.out.println(f.isDirectory()); // 이 경로에 있는 얘가 폴더냐 ->폴더면 true, 아니면 false //true

		f = new File("C:\\test\\t1");
		if(!f.exists()) { //f가 존재하지 않는다면
			f.mkdir(); //없으면 해당 폴더를 만드세요 make directory
		}

		f = new File("c:\\test","sub1.txt"); 
		System.out.println(f.isFile()); //파일이냐 //sub1이 존재하지않으므로 false
		f.delete(); //지우기

	}

}
