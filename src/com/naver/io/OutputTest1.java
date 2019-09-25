package com.naver.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTest1 {

	public static void main(String[] args) {
		String str = "piglet"; //안의 내용을 바꿔 실행하면 파일명의 내용도 바뀐다.
		File file = new File("c:\\test","t1.txt");
		FileWriter fw=null;
		
		try {
			//fw = new FileWriter(file); // false와 같다.
			fw = new FileWriter(file,false); 
			//true면 기존의 파일에 내용을 추가한다. false면 위의 내용으로 파일내용이 전체교체된다.
			fw.write(str);
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
