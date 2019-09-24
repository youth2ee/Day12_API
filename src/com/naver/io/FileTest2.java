package com.naver.io;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		
		File file = new File("c:\\test\\sub1\\sub2");
		
		System.out.println(file.exists());
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//file.mkdir(); //하나생성
		//file.mkdirs(); //부모까지 생성된다.
		
		file = new File("c:\\test\\sub1");
		file.delete();
		//해당폴더 안에 폴더가 있다면 지울 수 없다.
		//안이 비어야 폴더를 지울 수 있다.
		
		
	}

}
