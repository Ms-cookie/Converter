package com.skcc.lcap.opr;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String path = "resoureces\\oprlist.txt";
		OprCoordFileList oprList = new OprCoordFileList();
		FileWriterTest writer = new FileWriterTest();

		List<OprCoordFile> list = oprList.getList(path);

		Scanner sc = new Scanner(System.in);

		System.out.println(list.size() + "개의 json 파일을 만드시겠습니까?(y/n)");

		if (sc.nextLine().equals("y")) {

			for (int i = 0; i < list.size(); i++) {
				writer.makeFile(list.get(i).getOprConfigId() + ".json", list.get(i).toString());

				System.out.println("----" + list.get(i).getOprConfigId() + "----\n " + list.get(i).toString());
			}
		}
		for (int i = 0; i < list.size(); i++) {

			System.out.println(" ./oprperiod-put.sh " + list.get(i).getOprConfigId() + ".json");
			if (i % 5 == 0) {
				System.out.println("");
			}
		}

		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {

			System.out.println(" get /lcap/opr/config/history/" + list.get(i).getOprConfigId());
		}

	}
}
