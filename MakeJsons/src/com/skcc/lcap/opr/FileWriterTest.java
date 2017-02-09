package com.skcc.lcap.opr;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class FileWriterTest {
	static String path = "resoureces";

	public void makeFile(String fileName, String content) {

		try {

			// 파일 객체 생성
			File file = new File(path + fileName);

			// true 지정시 파일의 기존 내용에 이어서 작성
			FileWriter fw = new FileWriter(file, false);

			// 파일안에 문자열 쓰기
			fw.write(content);
			fw.flush();

			// 객체 닫기
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
