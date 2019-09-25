package com.naver.io;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("c:\\test\\sub1");
	    
		//1.
		//String [] ar = file.list(); // file안의 파일명을 배열로 받는다. 아직 객체생성X
		/*
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]); 
			file = new File("c:\\test\\sub1\\"+ar[i]); //이거해야 객체 생성
			file.delete();
		} //sub1안에 있는 파일명과 폴더명을 하나씩 받아서 
		  //주소값을 완성하여 지워준다.
		  //파일명은 확장자명도 넣어준다.
		 */
		
		
		//2.
		File [] ar = file.listFiles(); //file안의 파일을 객체로 만들어서 가져온다.
		
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]); 
			ar[i].delete(); //sub1 아래에 있는 파일과 폴더를 지운다.
		}
		
	}

}
